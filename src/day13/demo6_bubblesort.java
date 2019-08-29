package day13;

public class demo6_bubblesort {
    public static void main(String args[]) {
        int arr [] = {23,4,5,66,77,89};
        bubbleSort(arr);
        print(arr);
        System.out.println();
        selectSort(arr);
        print(arr);
    }
    public static void bubbleSort(int arr []) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                  swap(arr,j,j+1);
                }
            }
        }
    }
    public static void print(int [] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }

    }
    public static void selectSort(int arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                   swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int [] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

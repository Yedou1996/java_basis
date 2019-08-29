package day13;

public class demo7_array {
    public static void main(String args[]) {
        int arr[] = {12,34,35,66,77,88,99};
        System.out.println(getIndex(arr,12));
        System.out.println(getIndex(arr,99));
        System.out.println(getIndex(arr,66));
        System.out.println(getIndex(arr,88));
    }
    public static int getIndex(int[] arr,int value) {
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while (arr[mid]!=value) {
            if(arr[mid]>value){
              min = mid+1;
            }else if(arr[mid]<value) {
                max=mid-1;
            }
            mid=(min+max)/2;
            if (min>max) {
                return -1;
            }
        }
        return mid;
    }
}

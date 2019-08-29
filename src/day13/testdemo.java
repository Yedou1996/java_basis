package day13;

public class testdemo {
    public static void main(String[] args) {
        int arr1 [] ={54,65,65,78,32};
        for (int i = 0; i <arr1.length-1 ; i++) {
            for (int j = 0; j <arr1.length-1-i; j++) {
                if (arr1[j]>arr1[j+1]){
                    int temp =arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        for (int arr:arr1
             ) {
            System.out.println(arr);
        }

        }
    }


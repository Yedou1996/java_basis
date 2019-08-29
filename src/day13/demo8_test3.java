package day13;

import java.util.Arrays;

public class demo8_test3 {
    public static void main(String args[]) {
        int arr [] = {11,22,33,44,55,66};
        int arr2 [] ={44,32,66,99,22,66};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        for (int i= 0;i<arr2.length;i++){
            System.out.print(arr[i]+"  ");

        }

        System.out.println();
        System.out.println(Arrays.binarySearch(arr,66));
    }
}

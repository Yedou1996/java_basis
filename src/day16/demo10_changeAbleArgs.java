package day16;

import java.util.Arrays;

public class demo10_changeAbleArgs {
    public static void main(String[] args) {
        int arr [] = {11,34,23,241};
        //print(arr);
        print(11,223,34,32,423,432);
    }

//    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
    public static void print(int ... arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

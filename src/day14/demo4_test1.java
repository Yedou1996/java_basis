package day14;

import java.util.Arrays;

public class demo4_test1 {
    public static void main(String args[]) {
        String s = "91 27 46 38 50";
        String arr [] = s.split(" ");
        int arr1 [] = new int[arr.length];
        for (int i = 0; i<arr.length;i++) {
            arr1[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1);
//        String str = "";
//        for (int i = 0; i<arr1.length;i++) {
//            if (i==arr1.length-1) {
//                str=str+arr1[i];
//            }else {
//                str=str + arr1[i]+" ";
//            }
//        }
//        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<arr1.length;i++) {
            if (i == arr1.length-1) {
                sb.append(arr1[i]);
            }else {
                sb.append(arr1[i]+" ");
            }
        }
        System.out.println(sb);
    }
}

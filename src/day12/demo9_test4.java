package day12;

import java.util.Scanner;

public class demo9_test4 {
    public static void main(String args[]) {
        System.out.println("请输入一个字符串");
        Scanner s = new Scanner(System.in);
        String line=s.nextLine();
        char arr [] =line.toCharArray();
        String ss="";
        for (int i = arr.length-1;i>=0;i--) {
            ss=ss+arr[i];
        }
        String ss1 = ss.toUpperCase();
        System.out.println(ss1);

    }


}

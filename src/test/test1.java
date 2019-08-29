package test;

import java.util.Collections;

public class test1 {
    public  static int f(int n){
        if (n==1 || n==2){
            return n;
        }
        return f(n-2)+f(n-1);
    }
    public static void main(String[] args) {
        System.out.println(test1.f(20));
    }
}

package com.yedou.Math_;
import java.util.Scanner;

public class Game_number {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入一个1—100的整数：");
       int guessNumber=(int)(Math.random()*100)+1;
       while(true){
           int result=sc.nextInt();  //此条语句必须放在这里，不然会无限循环。
            if (guessNumber>result){
                System.out.println("小了");
            }else if (guessNumber<result) {
                System.out.println("大了");
            }else {
                System.out.println("猜对了");
                break;
            }
       }


    }
}

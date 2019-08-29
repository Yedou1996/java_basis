package day19;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class demo6_test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            String  ss = s.nextLine();
            try {
                int num = Integer.parseInt(ss);   //将录入的字符转换为int类型
                System.out.println(Integer.toBinaryString(num));   //将数字转换为二进制数
                break;
            }catch (Exception e) {
                try {
                    new BigInteger(ss);          //判断是否数字过大
                    System.out.println("录入错误，你输入的数字过大");
                }catch (Exception e1) {
                    try {
                        new BigDecimal(ss);                 //判断是否是小数
                        System.out.println("录入错误，你输入的是一个小数");
                    }catch (Exception e3) {
                        System.out.println("录入错误，非法字符");
                    }

                }

            }
        }


    }
}

package day12;
import java.util.Scanner;

public class demo1_scanner {
    public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            System.out.println("请输入一个整数");
            if(s.hasNextInt()) {
                int i=s.nextInt();
                System.out.println(i);
            } else {
                System.out.println("输入错误");

            }
    }
}

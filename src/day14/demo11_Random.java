package day14;

import java.util.Random;

public class demo11_Random {
    public static void main(String args[]) {
        Random r = new Random();
////        int i = r.nextInt();
////        int b = r.nextInt();
////        System.out.println(i);
////        System.out.println(b);
////        Random rd = new Random(200);
////        int a = rd.nextInt();
////        int c= rd.nextInt();
////        System.out.println(a);
////        System.out.println(c);
        for (int j =0;j<10;j++) {
            System.out.println(r.nextInt(100)); //随机int数0-99，要求1-100的话加1就可以
        }
    }
}

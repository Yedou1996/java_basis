package day13;

import java.util.Scanner;

public class demo5_test2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String ss =s.nextLine();
//        StringBuffer  sb = new StringBuffer(ss);
//        sb.reverse();

        System.out.println(arrReverse(ss));
    }
    public static String arrReverse(String se) {
        StringBuffer  sb = new StringBuffer(se);
        sb.reverse();
        return sb.toString();
    }

}

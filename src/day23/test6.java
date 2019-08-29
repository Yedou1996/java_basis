package day23;

import java.math.BigInteger;

public class test6 {
    public static void main(String[] args) {
        //1000的阶乘所有0和尾部0个数
        //不能用int数来接收，因为数字太大
//        int result = 1;
//        for (int i = 1; i <= 1000 ; i++) {
//            result = result*i;
//        }
//        System.out.println(result);   //数太大显示为0
        //demo1();   求1000阶乘所有0
        System.out.println(  demo2());  //求1000的阶乘末尾0个数
    }

    public static void demo1() {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1;i<=1000;i++) {
            BigInteger bi2 = new BigInteger(i+"");//bigInteger只能接收字符串
            bi1 = bi1.multiply(bi2);   //bi1和bi2相乘
        }
        System.out.println(bi1);
        String str = bi1.toString();//获取字符串表现形式
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if ('0' == str.charAt(i)){    //将字符串转换为字符对比
            count++;
            }
        }
        System.out.println(count);
    }
    public static int demo2() {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1;i<=1000;i++) {
            BigInteger bi2 = new BigInteger(i+"");//bigInteger只能接收字符串
            bi1 = bi1.multiply(bi2);   //bi1和bi2相乘
        }
        String str = bi1.toString();
        StringBuilder sb = new StringBuilder(str);   //线程不安全的
        str = sb.reverse().toString();     //反转再转成字符串
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if ('0' ==str.charAt(i)){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}

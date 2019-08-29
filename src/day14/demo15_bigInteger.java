package day14;

import java.math.BigInteger;

public class demo15_bigInteger {
    public static void main(String args[]) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("2");
        System.out.println(bi1.add(bi2));    //+
        System.out.println(bi1.subtract(bi2));   // -
        System.out.println(bi1.multiply(bi2));   //*
        System.out.println(bi1.divide(bi2));    /// (除)
     }
}

package day14;

import java.math.BigDecimal;

public class demo16_bigDecimal {
    public static void main(String args[]) {
        BigDecimal bg1 = new BigDecimal("2.0");   //用于精确计算小数，传入字符串
        BigDecimal bg2 = new BigDecimal("1.1");
        System.out.println(bg1.subtract(bg2));


        BigDecimal bg3 = BigDecimal.valueOf(2.0);
        BigDecimal bg4 = BigDecimal.valueOf(1.1);
        System.out.println(bg3.subtract(bg4));
    }
}

package day12;

public class demo6_test2 {
    public static void main(String args[]) {
        String s = "ADCKAKDLAaasdkzxlskad&&%&^%^632746276";
        int big =0;
        int small=0;
        int num=0;
        int other=0;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
            big++;
            }else if (c >= 'a' && c<= 'z') {
                small++;
            }else if (c >='0' && c<='9') {
                num++;
            }else {
                other++;
            }
        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(num);
        System.out.println(other);
    }
}

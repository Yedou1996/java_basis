package day14;

public class demo7_test2 {
    public static void main(String args []) {
        String s = "wwjakfakkasdllasjjjsdalllskad";
        String regex = "(.)\\1+";
        String arr [] = s.split(regex);
        for (int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}

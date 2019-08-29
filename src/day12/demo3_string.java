package day12;

public class demo3_string {
    public static void main(String args[]) {
        String s1=new String();
        System.out.println(s1);
        byte arr1 [] ={97,98,99};
        String s2 = new String(arr1);
        System.out.println(s2);
        String s3 = new String(arr1,1,1);
        System.out.println(s3);
        byte arr2 [] = {'a','b','c','d','e'};
        String s4 = new String(arr2);
        System.out.println(s4);
    }
}

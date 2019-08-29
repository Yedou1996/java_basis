package day14;

public class demo3_split {
    public static void main(String args[]) {
        String str = "娄爸爸.娄大王.娄大哥";
        String [] arr = str.split("\\.");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}

package day13;

public class demo2_delectCharAt {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("loubaba");
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.delete(0,sb.length());
    }
}

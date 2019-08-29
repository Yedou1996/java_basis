package day13;

public class demo3_replace {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("他爱总复习");
        sb.replace(0,1,"我");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }


}

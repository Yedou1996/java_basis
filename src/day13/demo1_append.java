package day13;

public class demo1_append {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        StringBuffer s1 = sb.append(true);
        StringBuffer s2 = sb.append(100);
        StringBuffer s3 = sb.append("haha");

        System.out.println(sb.toString());   //StringBuffer类重写toString()这个方法，显示的是属性值
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sb.insert(3,"xixi");
        System.out.println(sb.toString());
    }
}

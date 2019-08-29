package day22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
                //printStream和printWrite分别是打印的字节流和字符流，只操作数据目的的

public class demo7_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //demo1();
        PrintWriter pw = new PrintWriter(new FileOutputStream("pw.txt"),true);
        pw.println(97);
        pw.write(97);
        // pw.close();
    }

    public static void demo1() {
        System.out.println("qqq");
        PrintStream ps = System.out;   //获取标准输出流
        ps.println(97);                     //底层通过Integer.toString()将97转换为字符串
        ps.write(97);               //查找码表，找到对应的  a
        ps.close();
    }
}

package day22;

import java.io.*;

public class demo8_SystemInOut {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("aaa.txt"));   //改变标准输入流
        System.setOut(new PrintStream("bbb.txt"));     //改变标准输出流
        InputStream is = System.in;     //获取标准的键盘输入流，默认指向键盘，改变后指向文件
        PrintStream ps = System.out;      //获取标准的键盘输出流，默认指向控制台，该表后指向文件
        int b;
        while ((b = is.read()) != -1) {
            ps.write(b);
        }
        is.close();
        ps.close();
    }
}

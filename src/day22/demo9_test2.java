package day22;

import java.io.*;
           //修改标准输入输出流拷贝图片
public class demo9_test2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("11.jpg"));
        System.setOut(new PrintStream("copy111.jpg"));
        InputStream is = System.in;
        PrintStream ps = System.out;
        byte arr [] = new byte[1024];
        int b;
        while ((b = is.read(arr)) != -1) {
            ps.write(arr,0,b);
        }
        is.close();
        ps.close();
    }
}

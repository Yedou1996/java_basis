package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo3_copy {
    public static void main(String[] args) throws IOException {
       // demo1();//普通拷贝
        FileInputStream fis = new FileInputStream("11.jpg");
        FileOutputStream fos = new FileOutputStream("copy2.jpg");
        byte arr [] = new byte[fis.available()];  //一次性读取完存入字符数组
        fos.write(arr);


    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("11.jpg");  //创建输入流
        FileOutputStream fos = new FileOutputStream("copy.jpg");  //创建输出流
        int b;
        while ((b=fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}

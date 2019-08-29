package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo6_chinese {
    public static void main(String[] args) throws IOException {
        //demo();  //字节流读中文
        FileOutputStream fos = new FileOutputStream("ccc.txt",true);
        fos.write("我想睡觉".getBytes());//
        fos.close();
    }

    public static void demo() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        byte arr [] = new byte[2];
        int len;
        while ((len = fis.read(arr)) != -1) {
            System.out.println(new String(arr,0,len));
        }
        fis.close();
    }
}

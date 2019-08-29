package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo4_ArrayCopy {
    public static void main(String[] args) throws IOException {
        //demo1();  数组读取
        //demo2();   数组读取输出



    }

    public static void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileOutputStream fos = new FileOutputStream("ccc.txt");
        byte arr [] =new byte[2];    //长度一般为1024* 8.。。
        int len;
        while ((len = fis.read(arr)) != -1) {   //如果忘记加arr，返回的就不是读取的字节个数，而是字节码表值
            fos.write(arr,0,len);    //读取并写入文件。len代表长度，避免重复字节录入
        }
        fis.close();
        fos.close();
    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        byte arr [] = new byte[2];
        int a = fis.read(arr); //将文件上的字节数读到字节数组中
        System.out.println(a);
        for (byte b:arr
             ) {
            System.out.println(b);
        }
        fis.close();
    }
}

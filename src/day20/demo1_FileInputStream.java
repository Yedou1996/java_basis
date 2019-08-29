package day20;

import java.io.FileInputStream;

import java.io.IOException;

public class demo1_FileInputStream {
    public static void main(String[] args) throws IOException {
        //demo1();
        FileInputStream file = new FileInputStream("aaa.txt");

        while (file.read() != -1){
            System.out.println(file.read());
        }

    }

    public static void demo1() throws IOException {
        FileInputStream file = new FileInputStream("aaa.txt");   //创建流对象
        int a = file.read();  //从硬盘上读取一个字节
        System.out.println(a);
        file.close();   //关闭流释放资源
    }
}

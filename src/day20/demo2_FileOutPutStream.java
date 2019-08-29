package day20;


import java.io.FileOutputStream;
import java.io.IOException;
                           //FileOutputStream在创建文件时没有会创建一个文件，如果有会清空文件内容
public class demo2_FileOutPutStream {
    public static void main(String[] args) throws IOException {
        //demo1();
        FileOutputStream file = new FileOutputStream("bbb.txt",true);  //续写
        file.write(100);
        file.write(101);
        file.close();
    }

                               public static void demo1() throws IOException {
                                   FileOutputStream file = new FileOutputStream("bbb.txt");  //创建字节输出流对象，文件不存在也会创建该文件
                                   file.write(97);   //虽然是int数，但是会自动去除前8位
                                   file.write(98);
                                   file.write(99);
                                   file.close();
                               }
                           }

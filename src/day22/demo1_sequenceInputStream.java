package day22;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class demo1_sequenceInputStream {
    public static void main(String[] args) throws IOException {
        //demo1();   //整合两个输入流
        FileInputStream fis1 = new FileInputStream("aaa.txt");
        FileInputStream fis2 = new FileInputStream("bbb.txt");
        FileInputStream fis3 = new FileInputStream("fff.txt");
        Vector<FileInputStream> v = new Vector<>();   //创建集合对象，将流对象存储进来
        v.add(fis1);
        v.add(fis2);               //可以用来做一个歌曲串烧，，，把它们连接在一起
        v.add(fis3);
        Enumeration<FileInputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("aaa1.txt");
        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileInputStream fis1 = new FileInputStream("bbb.txt");
        SequenceInputStream sis = new SequenceInputStream(fis,fis1); //序列流，将两个输入流整合到一起
        FileOutputStream fos = new FileOutputStream("fff.txt");
        int b ;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
    }
}

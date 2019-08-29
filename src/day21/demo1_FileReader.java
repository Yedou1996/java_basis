package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo1_FileReader {
    public static void main(String[] args) throws IOException {
        //demo1();  //字符流读取单个汉字
        FileReader file = new FileReader("aaa.txt");
      int a;

        while ((a = file.read()) != -1) {
            System.out.print((char)a);
        }
        file.close();
    }

    public static void demo1() throws IOException {
        FileReader file = new FileReader("aaa.txt");
        int a = file.read();
        System.out.println(a);
        char b = (char)a;
        System.out.println(b);
        file.close();
    }
}

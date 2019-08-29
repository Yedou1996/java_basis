package day20;

import java.io.*;

public class demo8_test1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("jiami.jpg"));
        BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("jiemi.jpg"));
        int b;
        while ((b = bfis.read()) != -1) {
            bfos.write(b ^ 123);   //加密或者解密，异或同一个数两次是他本身
        }
        bfis.close();
        bfos.close();
    }
}

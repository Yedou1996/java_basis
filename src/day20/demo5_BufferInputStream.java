package day20;

import java.io.*;

public class demo5_BufferInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("11.jpg");
        FileOutputStream fos = new FileOutputStream("copy3.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}

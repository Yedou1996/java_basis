package day22;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class demo4_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        //raf.write(97);

        System.out.println(raf.read());
        raf.seek(10);        //在指定位置設置指針
        raf.write(98);
        raf.close();
    }
}

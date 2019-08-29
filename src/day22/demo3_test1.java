package day22;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo3_test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte arr [] = new byte[5];
        int b;
        while ((b = fis.read(arr)) != -1){
            baos.write(arr,0,b);
            //System.out.println(new String(arr,0,b));
        }
        System.out.println(baos);
        fis.close();
    }
}

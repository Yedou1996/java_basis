package day22;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
                                //内存输出流
public class demo2_ByteArrayOuputStream {
    public static void main(String[] args) throws IOException {
        // demo1();
        FileInputStream fis = new FileInputStream("aaa.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  //在内存中創建了可以增長的内存數組
        int b ;
        while ((b = fis.read()) != -1) {
            baos.write(b);              //將讀取道德數據寫道内存中
        }
        //byte arr[] = baos.toByteArray();   //將緩衝區的數據全部獲取出來
        //System.out.println(new String(arr));
        System.out.println(baos.toString());
        fis.close();
    }

       public static void demo1() throws IOException {
           FileInputStream fis = new FileInputStream("aaa.txt");
           byte arr [] = new byte[3];
           int b ;
           while ((b = fis.read(arr)) != -1) {
               System.out.println(new String(arr,0,b));
           }
       }
   }

package day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo7_tryFinally {    //完整的异常处理代码
    public static void main(String[] args) throws IOException {
        //demo1(); //1.6版本异常处理
        try(
                FileInputStream fis = new FileInputStream("aaa.txt");   //1.7版本异常处理，具有自动关闭功能
                FileOutputStream fos = new FileOutputStream("ddd.txt")

                ){
            int b;
            while ((b = fis.read()) !=-1) {
                fos.write(b);
            }
        }
    }

    public static void demo1() throws IOException {
        FileInputStream fis = null ;
        FileOutputStream fos = null ;
        try {
            fis = new FileInputStream("aaa.txt");
            fos = new FileOutputStream("ddd.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
        finally {
            try {
                if (fis != null)    //没开启不需要关闭
                fis.close();
            }
            finally {
                if (fos != null)
                fos.close();
            }
        }
    }
}
class myClose implements AutoCloseable{     //实现
    public void close (){
        System.out.println("我自动关闭了");
    }
}

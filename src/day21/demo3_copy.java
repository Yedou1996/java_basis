package day21;

import java.io.*;

public class demo3_copy {
    public static void main(String[] args) throws IOException {
        //demo1();   //普通拷贝
        //demo2();  // 自定义字符数组拷贝
        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ddd.txt"));
        int b;
        while ((b = br.read()) != -1) {     //buffered,缓存拷贝文件。
            bw.write(b);
        }
        br.close();
        bw.close();

    }

    public static void demo2() throws IOException {
        FileReader fr = new FileReader("aaa.txt");
        FileWriter fw = new FileWriter("ddd.txt");
        char arr[] =new char[1024];
        int b;
        while ((b = fr.read(arr)) != -1) {           //自定义字符数组拷贝
            fw.write(arr,0,b);
        }
        fr.close();
        fw.close();
    }

    public static void demo1() throws IOException {
        FileReader fr = new FileReader("aaa.txt");
        FileWriter fw = new FileWriter("ddd.txt");
        int b;
        while ((b=fr.read()) != -1) {
            fw.write(b);
        }
        fr.close();
        fw.close();  ///底层有一个小的缓冲区，2k，如果不关流，就会将内容写到缓冲区，关流会将内容刷新出来再关闭
    }
}
//字符流在只读或者只写时用，
//读取的时候是按照字符的大小来读取的，不会出现半个中文
//写入的时候可以直接将字符串输出，不用转换成字节数组
//字符流只能拷贝纯文本，可能找不到字符，会用？代替
package day21;

import java.io.*;
    //用指定的编码格式读取文件，
public class demo8_transIO {
    public static void main(String[] args) throws IOException {
        //指定码表读字符
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("aaa.txt"),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bbb.txt"),"utf-8"));
        int c;
        while ((c = br.read())!= -1){
            bw.write(c);
        }
        br.close();
        bw.close();
    }
}

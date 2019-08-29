package day21;

import java.io.*;

public class demo4_readLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("eee.txt"));
        String a;
        while ((a = br.readLine()) != null){   //整行整行的读取
            bw.write(a);

            bw.newLine();   //打出换行  ，类似于bw.write("\n\r")
            //newLine与“\n\r”的区别，newLine可以跨平台，“\r\n”只适用于windows。
        }
        br.close();
        bw.close();
    }
}

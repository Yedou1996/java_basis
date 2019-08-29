package day21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
              //用于显示行号和从多少行开始显示，也是整行整行的读
public class demo6_LineNumberReader {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("zzz.txt"));
        String line;
        lnr.setLineNumber(100);  //从101行开始显示
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber()+":"+line);  //获得行号
        }
    }
}

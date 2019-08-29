package day21;

import java.io.FileWriter;
import java.io.IOException;

public class demo2_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("write.txt");
        file.write("我好困啊，真的太困了");  //不需要转成字符数组：getbyte
        file.close();
    }
}

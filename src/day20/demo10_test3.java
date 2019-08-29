package day20;

import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo10_test3 {            //将录入的字符串存入文件中
    public static void main(String[] args) throws IOException {
        System.out.println("请输入需要录入的数据：");
        Scanner s = new Scanner(System.in);
        BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("text.txt"));
        while (true) {
            String line = s.nextLine();
            if ("quit".equals(line)) {
                break;
            }else {
                bfos.write(line.getBytes());   //将录入的字符串转换为字符数组
                bfos.write("\r\n".getBytes());   //换行
            }
        }
        bfos.close();
    }
}

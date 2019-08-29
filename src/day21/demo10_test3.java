package day21;

import java.io.*;

public class demo10_test3 {
    /*
    试用版软件。。。。。。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("config.txt"));
        String line =br.readLine();
        int times = Integer.parseInt(line);//将数字字符串转换为数字
        if (times>0) {
            System.out.println("你还有"+times--+"次试用机会");
            FileWriter fw = new FileWriter("config.txt");
            fw.write(times+"");
            fw.close();
        }else {
            System.out.println("你的试用次数已到，请购买正版");
            br.close();
        }


    }
}

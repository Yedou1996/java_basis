package day21;

import java.io.*;
import java.util.ArrayList;
            //反转文档，整行整行的
public class demo5_test1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("fff.txt"));
        ArrayList<String> list = new ArrayList<>();   //穿件临时集合，用以存读出的整行数据
        String line;
        while ((line = br.readLine()) != null) {   //当不为null时一直读取，
            list.add(line);  //添加到集合中
        }
        for (int i = list.size() -1; i>=0;i-- ) {   //倒着遍历
            bw.write(list.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

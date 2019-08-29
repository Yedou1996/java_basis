package day21;

import java.io.*;
import java.util.TreeMap;
     /*
     使用io流读取文件中字符出现的次数
      */
public class demo9_test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        TreeMap<Character,Integer> map = new TreeMap<>();
        int a;
        while ((a = br.read()) != -1) {
            char c = (char)a;    //强制类型转换
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("ccc.txt"));
        for (Character key: map.keySet()
             ) {
            bw.write(key+"="+map.get(key));
            bw.newLine();
        }
        bw.close();
    }
}

package day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo10_SystemIn {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   //InputStreamReader转换流
        String line = bf.readLine();
        System.out.println(line);
        bf.close();
    }
}

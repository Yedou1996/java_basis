package day20;

import java.io.*;
import java.util.Scanner;

public class demo9_test2 {    //录入文件路径，将文件拷贝到当前目录下
    public static void main(String[] args) throws IOException {

        File file =  getFile();
        BufferedInputStream bfis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream(file.getName()));
        int b ;
        while ((b = bfis.read())!= -1) {
            bfos.write(b);
        }
        bfis.close();
        bfos.close();
    }

    public static File getFile() {
        System.out.println("请输入一个文件路径：");
        Scanner s = new Scanner(System.in);
        while (true){
            String line =s.nextLine();
            File file = new File(line);
            if (file.isDirectory()) {   //是目录
                System.out.println("你输入的是文件夹目录，请重新输入：");
            }else if (!file.exists()) {   //存在
                System.out.println("你输入的路径不存在，请重新输入");
            }else {
                return file;
            }
        }
    }
}

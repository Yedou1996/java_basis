package day21;

import java.io.File;
import java.util.Scanner;
                 //键盘录入一个文件夹路径，打印出文件下所有的“.java”文件，问价夹下的问价夹用递归来实现
public class demo12_test4 {
    public static void main(String[] args) {
       File dir = getdir();  //获得文件目录
        printJavaFile(dir);   //


    }
    public static File getdir() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");

        while (true) {
            String line = s.nextLine();
            File file = new File(line);
            if (!file.exists()){
                System.out.println("你输入的文件夹路径不存在，请重新输入");
            } else if (file.isFile()) {
                System.out.println("你输入的是文件路径，请重新输入");
            }else {
                return file;
            }
        }

    }
    public static void printJavaFile(File file) {
        File [] subFile = file.listFiles();   //获取到文件夹路径下的所有文件存储到subFile数组中
        for (File sf:subFile
             ) {
            if (sf.isFile() && sf.getName().endsWith(".java")){
                System.out.println(sf);
            }else if (sf.isDirectory()){
                printJavaFile(sf);
            }
        }
    }
}

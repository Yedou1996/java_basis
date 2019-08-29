package day19;

import java.io.File;

public class demo9_fileMethod {
    public static void main(String[] args) {
        //demo1();   renameTO  改名，移动
        File file = new File("777.txt");
        System.out.println(file.delete());   //删除文件和文件夹，不走回收站，删除文件夹文件夹必须是空的
    }

    public static void demo1() {
        File file1 = new File("666.txt");
        File file2 = new File("777.txt");
        System.out.println(file1.renameTo(file2));   //如果路径相同就改名，路径不相同就是改名并剪切
    }
}

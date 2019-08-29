package day19;

import java.io.File;
import java.io.IOException;

public class demo8_fileMethod {
    public static void main(String[] args) throws IOException {
        //demo1();  //创建文件
        File dir = new File("aaa");
        System.out.println(dir.mkdir());  //穿件文件夹，如果存在就不创建

        File dir2 = new File("bbb\\ccc");
        System.out.println(dir2.mkdirs());    //创建多级目录
    }

    public static void demo1() throws IOException {
        File file = new File("666.txt");
        System.out.println(file.createNewFile());
    }
}

package day19;

import java.io.File;

public class demo7_file {
    public static void main(String[] args) {
        //
        //demo1(); //根据绝对路径判断是否存在该文件
        //demo2();   //给定路径和文件，判断是否存在
        File parent = new File("D:\\毕业论文\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video");
        String child = "19.14_File类(File类的概述和构造方法)_rec.avi";
        File file = new File(parent,child);  //把parent封装成一个File
        System.out.println(parent.exists());
        System.out.println(file.exists());
    }

    public static void demo2() {
        String parent = "D:\\毕业论文\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video";
        String child = "19.14_File类(File类的概述和构造方法)_rec.avi";
        File file = new File(parent,child);    //给定路径和文件，判断是否存在
        System.out.println(file.exists());
    }

    public static void demo1() {
        File file = new File("D:\\毕业论文\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video\\19.14_File类(File类的概述和构造方法)_rec.avi");
        System.out.println(file.exists());  //判断文件是否存在
    }
}

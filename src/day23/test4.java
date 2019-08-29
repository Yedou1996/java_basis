package day23;

import java.io.File;
         //录入一个文件夹路径，打印层级关系
public class test4 {
    public static void main(String[] args) {
        File dir = test1.getDir();
        printLev(dir,0);
    }
    public static void printLev(File dir ,int lev) {

            File [] subFiles = dir.listFiles();
        for (File subFile:subFiles
             ) {
            for (int i = 0; i <=lev ; i++) {
                System.out.print("\t");  //打印缩进

            }
            System.out.println(subFile);
            if (subFile.isDirectory()) {   //如果它是文件夹的话递归调用
                printLev(subFile,lev+1);  //不能用lev++或者++lev会改变原来lev的值，要让lev一直等于0
            }
        }
    }
}

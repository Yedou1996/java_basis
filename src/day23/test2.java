package day23;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File dir =test1.getDir(); //获得文件夹路径
        deleteDir(dir);
    }
    public static void deleteDir(File dir) {
        File subFile [] = dir.listFiles();
        for (File sub:subFile
             ) {
            if (sub.isFile()){
                sub.delete();
            }else {
                deleteDir(sub);
            }
        }
        dir.delete();
    }
}

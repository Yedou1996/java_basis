package day23;

import java.io.*;
     //输入一个源文件夹，输入一个目标文件夹，把源文件夹的所有内容拷贝到目标文件夹
public class test3 {
    public static void main(String[] args) throws IOException {
        File src = test1.getDir();
        File dest = test1.getDir();
        copy(src, dest);
    }
    public static void copy(File src, File dest) throws IOException {
        File newDir =new File(dest,src.getName());
        newDir.mkdir();
        File subFile [] = src.listFiles();
        for (File sub:subFile
             ) {
            if (sub.isFile()) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sub));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir,sub.getName())));
                int b;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else {
                copy(sub,newDir);
            }
        }
    }
}

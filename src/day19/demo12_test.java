package day19;

import java.io.File;
import java.io.FilenameFilter;

public class demo12_test {
    public static void main(String[] args) {
        File dir = new File("E:\\");    //获取文件夹下所有的文件名，判断是否以jpg结尾，是的话输出名字
        String [] arr = dir.list();
        for (String s:arr
             ) {
            if (s.endsWith(".jpg")){
                System.out.println(s);
            }
        }
        File subfile [] =  dir.listFiles();     //获取E盘下所有的文件夹和文件对象
        for (File string:subfile
             ) {
            if (string.isFile() && string.getName().endsWith(".jpg")){   //判断是否是文件，获取名字是否以.jpg结尾
                System.out.println(string);
            }
        }
        String arr1 [] = dir.list(new FilenameFilter() {    //文件名称过滤器
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);   //封装成file对象
                return file.isFile() &&file.getName().endsWith(".jpg");
            }
        });
        for (String string:arr1
             ) {
            System.out.println(string);
        }
    }
}

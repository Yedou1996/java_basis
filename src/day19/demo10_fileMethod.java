package day19;

import java.io.File;
import java.io.IOException;

public class demo10_fileMethod {
    public static void main(String[] args) throws IOException {
        /*
        A:判断功能
		* public boolean isDirectory():判断是否是目录
		* public boolean isFile():判断是否是文件
		* public boolean exists():判断是否存在
		* public boolean canRead():判断是否可读
		* public boolean canWrite():判断是否可写
		* public boolean isHidden():判断是否隐藏
         */
        File file = new File("aaa.txt");
        System.out.println(file.createNewFile());
        file.setReadable(false);  //设置为不可读
        System.out.println(file.canRead());   //windows系统认为所有的文件可读
        file.setWritable(false);   //设置为不可写
        System.out.println(file.canWrite());   //windows可以设置文件不可写

    }
}

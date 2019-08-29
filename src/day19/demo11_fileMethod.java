package day19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo11_fileMethod {
    /*
     A:获取功能
		* public String getAbsolutePath()：获取绝对路径
		* public String getPath():获取路径
		* public String getName():获取名称
		* public long length():获取长度。字节数
		* public long lastModified():获取最后一次的修改时间，毫秒值
		* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
		* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
	 */

    public static void main(String[] args) {
        //demo1();
        File file = new File("D:\\毕业论文\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video");
        String arr [] = file.list();     //仅为了获取文件名
        for (String i: arr
             ) {
            System.out.println(i);
        }
        File [] arr1 = file.listFiles();   //获取每个file对象
        for (File f:arr1
             ) {
            System.out.println(f);
        }
    }

    public static void demo1() {
        File file = new File("aaa.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.lastModified());   //文件的最后修改时间
        Date d = new Date(file.lastModified());
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //穿件日期格式

        System.out.println(sdf.format(file.lastModified()));
    }
}

package day23;

import java.io.File;
import java.util.Scanner;

//从键盘接收一个文件夹路径，统计所有文件的大小。
//直接获取文件夹大小是0
public class test1 {
    public static void main(String[] args) {
        File dir = getDir();
        System.out.println("所有文件的大小是："+getFileLength(dir));
    }
    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true){
            String line = sc.nextLine();
            File dir = new File(line);
            if (!dir.exists()) {
                System.out.println("你录入的文件夹路径不存在，请重新录入");
            }else if (dir.isFile()) {
                System.out.println("你录入的是文件路径，请重新录入");
            }else {
                return dir;
            }
        }
    }
    public static long getFileLength(File dir) {
        long len = 0;
        File subFile [] = dir.listFiles();
        for (File sub:subFile
             ) {
            if (sub.isFile()){
                len = sub.length()+len;
            }else {
                len = len + getFileLength(sub);
            }
        }
        return len;
    }
}

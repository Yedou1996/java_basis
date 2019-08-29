package dya25;

import java.io.IOException;

public class demo2_RunTime {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
       // r.exec("shutdown -s -t 300");   //设计计算机关闭时间
        r.exec("shutdown -a");
    }
}

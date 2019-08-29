package dya25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo8_Executors {
    public static void main(String[] args) {
        ExecutorService pool =  Executors.newFixedThreadPool(2); //创建线程池
        pool.submit(new myRunnable());   //将线程放进线程池并执行
        pool.submit(new myRunnable());
        pool.shutdown();  //关闭线程池
    }
}

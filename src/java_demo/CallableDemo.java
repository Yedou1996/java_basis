package java_demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("callable is start");
        return 1024;
    }
}
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread t = new Thread(futureTask,"AA");
        t.start();
        System.out.println(futureTask.get());
    }
}

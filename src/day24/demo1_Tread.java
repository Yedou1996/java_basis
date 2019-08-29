package day24;
/*
        线程是程序执行的一条路径, 一个进程中可以包含多条线程
	* 多线程并发执行可以提高程序的效率, 可以同时完成多项工作
 */
public class demo1_Tread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();  //创建子类对象
        mt.start();   //开启线程
        for (int i = 0; i <100 ; i++) {
            System.out.println("bbb");
        }
    }
}
class MyThread extends Thread {   //继承   //通过继承来实现多线程
    @Override
    public void run() {    //重写
        for (int i = 0; i <100 ; i++) {
            System.out.println("aaa");
        }
    }
}

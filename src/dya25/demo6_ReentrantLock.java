package dya25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class demo6_ReentrantLock {
    public static void main(String[] args) {
        final Printer3 p = new Printer3();
        new Thread() {
            public void run() {
                while(true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while(true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while(true) {
                    try {
                        p.print3();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

}
/*1,在同步代码块中,用哪个对象锁,就用哪个对象调用wait方法
 * 2,为什么wait方法和notify方法定义在Object这类中?
 * 	因为锁对象可以是任意对象,Object是所有的类的基类,所以wait方法和notify方法需要定义在Object这个类中
 * 3,sleep方法和wait方法的区别?
 * a,sleep方法必须传入参数,参数就是时间,时间到了自动醒来
 *   wait方法可以传入参数也可以不传入参数,传入参数就是在参数的时间结束后等待,不传入参数就是直接等待
 * b,sleep方法在同步函数或同步代码块中,不释放锁,睡着了也抱着锁睡
 * 	wait方法在同步函数或者同步代码块中,释放锁
 */
class Printer3 {
    private ReentrantLock  r = new ReentrantLock();
    private Condition c1 =r.newCondition();    //创建监视器
    private Condition c2 =r.newCondition();
    private Condition c3 =r.newCondition();

    private int flag = 1;
    public void print1() throws InterruptedException {
             r.lock();  //获取锁
            if (flag != 1) {
               c1.await();				//当前线程等待
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag = 2;
            //this.notify();						//随机唤醒单个等待的线程
            c2.signal();
            r.unlock();  //释放锁
    }

    public void print2() throws InterruptedException {
        r.lock();  //获取锁
            if (flag != 2) {
              c2.await();					//线程2在此等待
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
            flag = 3;
            //this.notify();
           c3.signal();
        r.lock();  //获取锁
    }

    public void print3() throws InterruptedException {
        r.lock();  //获取锁
            if (flag != 3) {
                c3.await();						//线程3在此等待,if语句是在哪里等待,就在哪里起来
                //while循环是循环判断,每次都会判断标记
            }
            System.out.print("i");
            System.out.print("t");
            System.out.print("h");
            System.out.print("e");
            System.out.print("i");
            System.out.print("m");
            System.out.print("a");
            System.out.print("\r\n");
            flag = 1;
            //this.notify();
          c1.signal();
        r.lock();  //获取锁
    }
}

package java_demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData1{
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    public void print5(){
        lock.lock();
        try {
            while (number!=0){
                condition1.await();
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
            number = 1;
            condition2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try {
            while (number!=1){
                condition2.await();
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
            number = 2;
            condition3.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try {
            while (number!=2){
                condition3.await();
            }
            for (int i = 0; i <15 ; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
            number = 0;
            condition1.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
public class syncAndReentrantLockDemo {
    public static void main(String[] args) {
        ShareData1 shareData1 = new ShareData1();
        for (int i = 1; i <5; i++) {
            new Thread(()->{
                shareData1.print5();
            },"AA").start();
        }
        for (int i = 1; i <5; i++) {
            new Thread(()->{
                shareData1.print10();
            },"BB").start();
        }
        for (int i = 1; i <5; i++) {
            new Thread(()->{
                shareData1.print15();
            },"CC").start();
        }

    }
}

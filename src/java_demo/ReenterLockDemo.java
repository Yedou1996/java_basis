package java_demo;

/**
 * 可重入锁
 * synchronized
 */
class phone{
    public synchronized void sendsSMS(){
        System.out.println(Thread.currentThread().getName()+"invoked sendSMS");
        sendsEmail();
    }
    public synchronized void sendsEmail(){
        System.out.println(Thread.currentThread().getName()+"invoked sendsEmail");
    }
}
public class ReenterLockDemo {
    public static void main(String[] args) {
        phone phone = new phone();
        new Thread(()->{
            try {
                phone.sendsSMS();
            }catch (Exception e){
                e.printStackTrace();
            }

        },"t1").start();
        new Thread(()->{
            try {
                phone.sendsSMS();
            }catch (Exception e){
                e.printStackTrace();
            }

        },"t2").start();
    }
}

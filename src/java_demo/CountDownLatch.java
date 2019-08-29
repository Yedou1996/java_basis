package java_demo;

/**
 * CountdownLatch
 *    用来控制最后一个执行
 *   countDownLatch.countDown();
 *   countDownLatch.await();
 */

public class CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(6);
        for (int i = 1; i <6 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"上完自习走人");
                countDownLatch.countDown();
            },String.valueOf(i)).start();

        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"班长最后离开教室，锁门");
    }
}

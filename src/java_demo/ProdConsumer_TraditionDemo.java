package java_demo;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


class MyResource{
    private volatile boolean Flag = true;//默认开启，进行生产+消费
    private AtomicInteger atomicInteger = new AtomicInteger(1);
    BlockingQueue<String> blockingQueue = null;

    public MyResource(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }
    public void stop(){
        this.Flag = false;
    }

    public void myProd()throws Exception{
        String data = null;
        boolean retValue;
        while (Flag){
            data = atomicInteger.getAndIncrement()+"";
            retValue = blockingQueue.offer(data,2,TimeUnit.SECONDS);
            if (retValue){
                System.out.println(Thread.currentThread().getName()+"插入队列"+data+"成功");
            }else {
                System.out.println(Thread.currentThread().getName()+"插入队列"+data+"失败");
            }
            TimeUnit.SECONDS.sleep(1);  //设置一秒钟生产一个
        }
        System.out.println(Thread.currentThread().getName()+"生产停止");
    }
    public void myConsumer()throws Exception{
        String result = null;
        while (Flag){
            result = blockingQueue.poll(2,TimeUnit.SECONDS);
            if (null == result||result.equalsIgnoreCase("")){
                Flag = false;
                System.out.println(Thread.currentThread().getName()+"\t2秒钟没取到，消费退出");
                System.out.println();
                System.out.println();
                return;
            }
            System.out.println(Thread.currentThread().getName()+"\t消费队列"+result+"成功");
        }
    }


}
public class ProdConsumer_TraditionDemo {
    public static void main(String[] args) {
        MyResource myResource = new MyResource(new ArrayBlockingQueue(10));
        new Thread(()->{
            try {
                myResource.myProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"生产线程启动");
        },"prod").start();
        new Thread(()->{
            try {
                myResource.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"消费线程启动");
        },"prod").start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        myResource.stop();
        System.out.println("5秒钟的生产时间到，停止生产和消费");
    }
}

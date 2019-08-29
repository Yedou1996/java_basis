package java_demo;

/**
 * 多线程下原子性的演示
 * 多线程I++的安全问题
 *  atomicInteger保证原子性
 *
 */
public class AQS {
    public static void main(String[] args) {
        mydata mydata = new mydata();
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                for (int j = 0; j <1000 ; j++) {
                    mydata.addnumber();
                    mydata.add();   //保证原子性的
                }
            },String.valueOf(i)).start();

        }
        while (Thread.activeCount()>2){   //main线程和垃圾回收线程
            Thread.yield();   //礼让线程
        }
        System.out.println(Thread.currentThread().getName()+"Finally number value"+mydata.number);
        System.out.println(Thread.currentThread().getName()+"Finally number value"+mydata.atomicInteger);

    }
}
class mydata{
    volatile int number=0;
    java.util.concurrent.atomic.AtomicInteger atomicInteger =new java.util.concurrent.atomic.AtomicInteger();
    public  void addnumber(){
        number++;
    }

    public void add() {
        atomicInteger.getAndIncrement();
    }
}

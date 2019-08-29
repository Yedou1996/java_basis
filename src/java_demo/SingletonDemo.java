package java_demo;

/**
 *  单例模式
 *  单例模式下指令多线程安全问题解决
 *  DCL（double check lock）双端检索机制
 *  加入volatile可以禁止指令重排。
 */
public class SingletonDemo {
    private static volatile SingletonDemo instans = null;
    private SingletonDemo(){
        System.out.println(Thread.currentThread().getName()+"\t 我是构造方法SingletonDemo()");
    }

    public static SingletonDemo getInstans() {
        if (instans == null){
            synchronized (SingletonDemo.class){
                if (instans == null){
                    instans = new SingletonDemo();
                }
            }
        }
        return instans;
    }

    public static void main(String[] args) {
//        System.out.println(SingletonDemo.getInstans() == SingletonDemo.getInstans());
//        System.out.println(SingletonDemo.getInstans() == SingletonDemo.getInstans());
//        System.out.println(SingletonDemo.getInstans() == SingletonDemo.getInstans());
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
            SingletonDemo.getInstans();
            },String.valueOf(i)).start();

        }

    }
}

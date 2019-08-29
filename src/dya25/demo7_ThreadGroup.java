package dya25;

public class demo7_ThreadGroup {
    public static void main(String[] args) {
        //demo1(); //主线程组
        myRunnable mr = new myRunnable();   //创建Runnable的子类对象
        ThreadGroup tg = new ThreadGroup("线程组");   //创建心得线程组
        Thread t1 = new Thread(tg,mr,"线程1");  //将线程放到线程组中
        Thread t2 = new Thread(tg,mr,"线程2");

        System.out.println(t1.getThreadGroup().getName());  //获取组名
        System.out.println(t2.getThreadGroup().getName());

        tg.isDaemon(); //将整个组设为守护线程
    }

    public static void demo1() {
        myRunnable mr = new myRunnable();
        Thread t1 = new Thread(mr,"线程一");
        Thread t2 = new Thread(mr,"线程二");

        ThreadGroup tg1 =  t1.getThreadGroup();
        ThreadGroup tg2 =  t2.getThreadGroup();

        System.out.println(tg1.getName());   //默认是主线程
        System.out.println(tg2.getName());
    }
}
class myRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"...."+i);
        }
    }
}
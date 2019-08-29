package day24;

public class demo10_synchronized {
    //多线程并发出现创建多个对象情况，线程安全问题
    public static void main(String[] args) {
       final print p = new print();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    p.print1();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    p.print2();
                }
            }
        }.start();
    }
}
class print{
    Object o =new Object();
    public void print1(){
        synchronized (o){                 //同步代码块。锁机制，锁对象可以使任意的
            System.out.print("我");
            System.out.print("爱");
            System.out.print("你");
            System.out.print("哈哈");
            System.out.print("\n\t");
        }

    }
    public void print2(){
        synchronized (o){           //锁对象不能用匿名对象，因为匿名对象不是同一个对象
            System.out.print("你");
            System.out.print("喜");
            System.out.print("欢");
            System.out.print("吃");
            System.out.print("\n\t");
        }

    }
}
package day24;
/*
 * 查看源码的区别:
 * a.继承Thread : 由于子类重写了Thread类的run(), 当调用start()时, 直接找子类的run()方法
 * b.实现Runnable : 构造函数中传入了Runnable的引用, 成员变量记住了它, start()调用run()方法时内部判断成员变量Runnable的引用是否为空, 不为空编译时看的是Runnable的run(),运行时执行的是子类的run()方法

 * 继承Thread
 * 好处是:可以直接使用Thread类中的方法,代码简单
 * 弊端是:如果已经有了父类,就不能用这种方法
 * 实现Runnable接口
 * 好处是:即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而且接口是可以多实现的
 * 弊端是:不能直接使用Thread中的方法需要先获取到线程对象后,才能得到Thread的方法,代码复杂
 */
public class demo2_Tread {
    public static void main(String[] args) {
            MyRunnable mr = new MyRunnable();  //创建子类对象
            //Runnable target = mr;  父类引用指向子类对象
            Thread t = new Thread(mr);   //将其当做参数传递给Thread的构造函数
            t.start();   //开启多线程
        for (int i = 0; i <100 ; i++) {
            System.out.println("bbb");
        }

    }
}
class MyRunnable implements Runnable {    //通过实现Runnable接口来实现多线程
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("aaa");
        }
    }
}

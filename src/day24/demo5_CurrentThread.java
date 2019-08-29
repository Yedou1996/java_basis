package day24;

public class demo5_CurrentThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(this.getName()+"............aaa");
            }
        }.start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"bbbbbbbbbbb");
            }
        }).start();
        Thread.currentThread().setName("我是主线程");
        System.out.println(Thread.currentThread());
    }
}

package day24;

public class demo3_Tread {
    public static void main(String[] args) {
        new Thread(){       //继承Thread方法
            @Override
            public void run(){    //重写run方法
                for (int i = 0; i <100 ; i++) {
                    System.out.println("aaaaaaaaa");
                }
            }
        }.start();  //开启多线程
        new Thread(new Runnable() {   //将Runnable的子类的对象传递给Thread的构造方法
            @Override
            public void run() {   //重写run方法
                for (int i = 0; i <100 ; i++) {
                    System.out.println("bbb");
                }
            }
        }).start();   //开启线程
    }
}

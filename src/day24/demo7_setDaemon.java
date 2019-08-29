package day24;

public class demo7_setDaemon {
                           //应用场景qq传文件时突然关闭窗口
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <2 ; i++) {
                    System.out.println(this.getName()+"...aaaaaaaaaaaaaaaaaaaaaa");
                }

            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <50 ; i++) {
                    System.out.println(this.getName()+"....bb");
                }

            }
        };
        t2.setDaemon(true); //将t2设置为守护线程
        t1.start();
        t2.start();
    }
}

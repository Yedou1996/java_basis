package dya25;

public class demo4_notify {
    public static void main(String[] args) {
       print p = new print();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
class print{
        private int flag =1;
        public void print1() throws InterruptedException {
        synchronized (this){
            if (flag!=1){
                this.wait();  //等待
            }
            System.out.print("你");
            System.out.print("好");
            System.out.print("你");
            System.out.print("好");
            System.out.println("\n\t");
            flag = 2;
            this.notify();   //随机唤醒单个等待的线程
        }
    }
    public void print2() throws InterruptedException {
        synchronized (this){
            if (flag!=2){
                this.wait();
            }
            System.out.print("和牛");
            System.out.print("一起");
            System.out.print("哈哈");
            System.out.print("哈");
            System.out.println("\n\t");
            flag = 1;
            this.notify();
        }
    }
}

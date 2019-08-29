package day24;

public class demo6_Sleep {
    public static void main(String[] args) throws InterruptedException {
        //demo1(); //主方法内sleep方法示例
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"。。。。。aaaaaaaaaaaa");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"...........bbbbbb");
                }
            }
        }.start();
    }

    public static void demo1() throws InterruptedException {
        for (int i = 20; i >=0 ; i--) {
            Thread.sleep(1000);
            System.out.println("倒计时"+i+"秒");
        }
    }
}

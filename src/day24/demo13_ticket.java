package day24;

public class demo13_ticket {
    public static void main(String[] args) {
        ticket t =new ticket();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
class ticket implements Runnable{
    private int ticket =100;     //实现Runnable接口时不需要静态，同步对象也可以是this，因为都是指向的一个地方
        @Override
        public void run() {
            synchronized (this){
            while (true){
                if (ticket == 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"这是第"+ticket--+"号票");
            }
    }

    }
}
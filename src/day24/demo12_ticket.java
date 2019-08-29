package day24;

public class demo12_ticket {
    public static void main(String[] args) {
        ticket1 t1 =  new ticket1();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}
class ticket1 extends Thread{
    private static int ticket = 100;   //加静态确保卖的是同100张票

    //private static Object o = new Object(); //如果引用数据类型当做锁对象，必须是静态的
    @Override
    public void run() {
        synchronized (ticket.class) {
            while (true){
                if (ticket == 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {   //多线程并发导致线程出现安全问题，给代码块做同步可以解决
                    e.printStackTrace();
                }
                System.out.println("这是第"+ticket--+"号票");
            }
        }
    }
}

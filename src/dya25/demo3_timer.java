package dya25;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class demo3_timer {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        //在指定时间安排指定的任务
        t.schedule(new myTimerMask(),new Date(119,3,26,10,13,50),3000);//每3秒执行一次
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}
class myTimerMask extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床学习");
    }
}

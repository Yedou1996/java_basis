package day24;

public class demo14_deadLock {
    private static String s1="筷子1";
    private static String s2 ="筷子2";
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (s1){
                        System.out.println("获取"+s1+"等待"+s2);
                        synchronized (s2){
                            System.out.println("拿到"+s2+"开吃");
                        }
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (s2){
                        System.out.println("获取"+s2+"等待"+s1);
                        synchronized (s1){
                            System.out.println("拿到"+s1+"开吃");
                        }
                    }
                }
            }
        }.start();
    }
}

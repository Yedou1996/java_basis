package day24;

public class demo9_priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("aaaaaaaaaaaaaa");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("bbbbbbbbbbbbb");
                }
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);//设置最大优先级
        t2.setPriority(Thread.MIN_PRIORITY);//设置最小优先级 优先级范围为1-10
    }
}

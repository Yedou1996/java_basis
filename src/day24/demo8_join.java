package day24;

public class demo8_join {
    public static void main(String[] args) {
        final Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("...aaaaaaaaaaaaaaaaaaa");
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    if (i == 2){
                        try {
                            t1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(".....bb");
                }
            }
        };
        t1.start();
        t2.start();
    }
}

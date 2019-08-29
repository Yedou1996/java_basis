package day24;

public class demo4_set_getName {
    public static void main(String[] args) {
        new Thread("线程一"){ //通过构造函数给线程命名
            @Override
            public void run() {
                System.out.println(this.getName()+"......aaaaa");
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                this.setName("线程二"); //通过set方法给线程命名
                System.out.println(this.getName()+".......bbbbbbbbbbbbb");
            }
        }.start();
    }
}

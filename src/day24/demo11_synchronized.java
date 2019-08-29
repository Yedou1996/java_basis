package day24;

public class demo11_synchronized {
    public static void main(String[] args) {

    }
}
class print1{
            //非静态的同步方法锁对象是this
            //静态同步方法的锁对象是该类的字节码文件（print1.class）
    public  synchronized void print1(){     //同步方法只要在方法上加synchronized关键字就可以
            System.out.print("我");
            System.out.print("爱");
            System.out.print("你");
            System.out.print("哈哈");
            System.out.print("\n\t");


    }
    public void print2(){
        synchronized (this){
            System.out.print("你");
            System.out.print("喜");
            System.out.print("欢");
            System.out.print("吃");
            System.out.print("\n\t");
        }

    }
}

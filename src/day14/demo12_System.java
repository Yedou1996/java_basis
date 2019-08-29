package day14;

public class demo12_System {
    public static void main(String args[]) {
        for (int i = 0;i <100;i++) {
            new demo();
            System.gc();   //运行垃圾回收
        }
         System.exit(0);  //退出java虚拟机
        System.out.println(1111);
    }
}
class demo {
    public void finalize() {         //重写垃圾回收方法
        System.out.println("垃圾被清理了");
    }
}

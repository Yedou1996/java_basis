package day19;

public class demo5_final_finally_finalize {
    /*
    final,finally,finalize的区别
        final修饰类，不能被继承
        修饰方法不能被重写
        修饰变量，只能赋值一次

        finally是try语句体中的一个语句体，不能单独使用，用来释放资源

        finalize是一个方法，当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法


        如果catch里面有一个return语句，先执行return，千万不要在finally里面写返回语句。
     */
    public static void main(String[] args) {
       demo1 d1 = new demo1();
        System.out.println( d1.method());

    }
}
class demo1{
    public int method(){
        int x = 10;
        try {
            x = 20;
            System.out.println(10/0);
            return x;
        }catch (Exception e) {
            x =30;
            return x;
        }finally {
            x = 40;
        }
    }
}

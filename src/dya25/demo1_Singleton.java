package dya25;

public class demo1_Singleton {

    public static void main(String[] args) {
      singleton s1 =singleton.s;   //成员变量被私有，不能类名点调用
//        singleton.s=null;
      singleton s2 =singleton.s;
//        System.out.println(s1==s2);
//        singleton s1 = singleton.getInstans();
//        singleton s2 = singleton.getInstans();
       System.out.println(s1==s2);


    }
}
//饿汉式
//class singleton{
//    //私有构造方法上，其他类不能访问
//    private singleton(){
//    }
//    //创建本来对象
//    private static singleton s = new singleton();
//    //对外提供公共访问方法
//    public static singleton getInstans(){
//        return s;
//    }
//}
//懒汉式   单例的延迟加载模式   单例设计模式是为了对象的唯一性
//class singleton{
//    //私有构造方法上，其他类不能访问
//    private singleton(){
//    }
//    //声明一个引用
//    private static singleton s ;
//    //对外提供公共访问方法
//    public static singleton getInstans(){
//      if (s==null){
//          s =new singleton();
//      }
//      return s;
//    }
//}
/*
    饿汉式和懒汉式的区别：
    饿汉式是空间换时间，懒汉式是时间换空间
    在多线程访问时，懒汉式有可能创建多个对象
 */

class singleton{
    //私有构造方法上，其他类不能访问
    private singleton(){
    }
    //声明一个引用
    public static final singleton s =new singleton() ;

}
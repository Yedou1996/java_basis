package day21;
                             /*
                             装饰设计模式：
                             好处：减少偶尔性，
                             继承模式实现的话父类做改动，子类也会改动。
                             被装饰的类的变化与装饰类的变化无关。
                              */
public class demo7_wrap {
    public static void main(String[] args) {
            lxl l = new lxl(new student());
            l.code();
    }
}
interface code {
    public void code();
}

class student implements code{

    @Override
    public void code() {
        System.out.println("java");
        System.out.println("javaWeb");
    }
}
class lxl implements code{
    private student s;  //获取学生引用   .获取被装饰类的引用
    public lxl(student s) {           //在构造方法中传入被装饰类的对象
        this.s = s;
    }
    @Override
    public void code() {    //对原有的功能进行升级
        s.code();
        System.out.println("shh");
        System.out.println("数据库");
        System.out.println("大数据");
        System.out.println("........");
    }
}
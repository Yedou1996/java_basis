package java_demo;

/**
 * 饿汉式：直接创建对象，不管需不需要
 * 1.构造器私有化
 * 2.自行创建，并且用静态变量保存
 *3.向外提供这个实例
 * 4.强调这是一个单例。我们可以用final修饰
 */
public class SingletonDemo1 {
    public static final SingletonDemo1 INSTANS = new SingletonDemo1();
        private SingletonDemo1(){

        }
}

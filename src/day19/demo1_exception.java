package day19;

public class demo1_exception {
    /*
    try catch
    try catch finally
    try finally
    try :检测异常
    catch：捕获异常
    finally：释放资源
     */
    public static void main(String[] args) {
        demo d = new demo();
        try {
            int a =d.div(10,0);
            System.out.println(a);
        }catch (ArithmeticException a){
            System.out.println("出错了，除数为零了");
        }

    }
}
class demo {
    public static int div(int a,int b) {
        return a/b;
    }
}

package day19;

public class demo2_throwable {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e) {
            System.out.println(e.getMessage());  //获取异常信息
            System.out.println(e.toString() );   //获取异常类名和异常信息，返回字符串
            e.printStackTrace();   //jvm默认就用这种方式处理异常
        }
    }
}

package day21;

public class demo11_Recursive {
    //递归，自己调用自己
    //递归的弊端是：不用调用次数过多，容易导致栈内存溢出
    //好处是不用知道循环次数构造方法
    //构造方法不能使用递归调用，
    
    public static void main(String[] args) {

//        int i=1 ;
//        for (int b = 1;b<=5;b++) {
//            i = i*b;
//        }
//        System.out.println(i);
        System.out.println(fun(6));

    }
    public static int fun(int num) {
            if (num ==1) {
                return num;
            }else {
                return num * fun(num -1);
            }
    }

}

package day14;

public class demo10_Math {
    public static void main (String args []) {
        System.out.println(Math.abs(-10)); //取绝对值
        System.out.println(Math.PI);   //π
        System.out.println(Math.ceil(12.1));   //向上取整，结果是double
        System.out.println(Math.floor(12.1));  //向下取整，结果是double
        System.out.println(Math.max(20,30));   //比较大小，返回最大值
        System.out.println(Math.pow(2.5,3));   //2的3次方 得到double数
        System.out.println(Math.random());    //生成0.0-1.0之间的随机数，包括0.0，不包括1.0
        System.out.println(Math.round(12.3f));  //四舍五入，得到int数
        System.out.println(Math.sqrt(4));    //开平发
    }
}

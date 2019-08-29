package com.yedou.Inner_class;

public class noName_innerclass {
    public static void main(String args[]) {
    Outer o=new Outer();
    o.method();
    }
}
interface inter{
    public void show1();
    public void show2();

}
class Outer {
    public void method(){
        new inter(){
            @Override
            public void show1() {
        System.out.println("show1");
            }

            @Override
            public void show2() {

            }
        }.show1();
    }
}

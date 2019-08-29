package com.yedou.Inner_class;

public class demo_noName {
    public static void main(String args[]) {
        oute.method().show();
    }
}
interface Inter{
    void show();
}
class oute{
    public static Inter method(){
        return new Inter() {
            @Override
            public void show() {
            System.out.println("Hello world");
            }
        };
    }
}

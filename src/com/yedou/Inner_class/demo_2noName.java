package com.yedou.Inner_class;

public class demo_2noName {
    public static void main(String args[]) {
        student s =new student();
        s.method(new person() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });
    }
}
abstract class person{
    public abstract void show();
}
class student  {
    public void method(person p){
      p.show();
    }
}

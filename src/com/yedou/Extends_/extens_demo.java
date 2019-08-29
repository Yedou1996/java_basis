package com.yedou.Extends_;

public class extens_demo {
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        d.color="pink";
        c.color="red";
        d.leg=4;
        c.leg=4;
        System.out.println(d.color);
        System.out.println(d.leg);
        d.eat();
        d.sleep();
    }
}
class animal{
    String color;
    int leg;
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep()  {
        System.out.println("睡觉");
    }

}
class dog extends animal{
    /*String color;
    int leg;
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep()  {
        System.out.println("睡觉");
    }*/

}
class cat extends animal{
    /*
    String color;
    int leg;
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep()  {
        System.out.println("睡觉");
    }
    */
}

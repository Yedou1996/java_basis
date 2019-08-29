package com.yedou.polymorphism;

public class demo1 {
    public static void main(String[] args) {

        method(new cat());
        method(new dog());
    }
    public static void  method(animal a){
        if( a instanceof cat) {
            cat c=(cat)a;
            c.eat();
            c.catchMouse();
        }else if (a instanceof dog) {
            dog d=(dog)a;
            d.eat();
            d.lookHmoe();
        }else {
            a.eat();
        }
    }
}
class animal{
    public void eat(){
        System.out.println("吃饭");
    }
}
class cat extends animal{
    public void eat(){
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class dog extends animal{
    public void eat(){
        System.out.println("吃肉");
    }

    public void lookHmoe(){
        System.out.println("看家");
    }
}
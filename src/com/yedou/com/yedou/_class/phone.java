package com.yedou.com.yedou._class;

public class phone {
    public static void main(String[] args) {
        phone_1 a=new phone_1();
        a.brand="奔驰";
        a.price=15.66;
        System.out.println(a.brand+":"+a.price);
        a.call();
        a.play();
    }
}
class phone_1 {
    String brand;
    double price;
    public void call() {
        System.out.println("打电话");
    }
    public void play() {
        System.out.println("玩游戏");
    }

}

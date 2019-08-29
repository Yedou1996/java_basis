package com.yedou.com.yedou._class;

public class phone_demo {
    public static void main(String[] args) {
        phone1 p =new phone1();
        p.setBrand("苹果");
        p.getBrand();
        p.setPrice(12999);
        p.getPrice();
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        p.call();
        p.message();
        p.playGame();
    }
}
class phone1{
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void call(){
        System.out.println("打电话");
    }
    public void message(){
        System.out.println("发短信");

    }
    public  void playGame(){
        System.out.println("玩游戏");
    }


}

package com.yedou.com.yedou._class;

public class Rectangle_demo {
    public static void main(String[] args) {
        rectangle r1 =new rectangle();
        r1.setWidth(5);
        r1.setHeight(9);
        r1.getArea();
        r1.getLength();
    }
}

class rectangle{
    private int width;
    private int height;
    public rectangle(){}
    public rectangle(int width,int height) {
        this.width=width;
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }

    public int getWidth() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return width;
    }
    public void getArea() {
        int area=width*height;
        System.out.println(area);
    }
    public void getLength() {
        int length=(width+height)*2;
        System.out.println(length);
    }
}

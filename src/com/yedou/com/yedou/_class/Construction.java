package com.yedou.com.yedou._class;

public class Construction {
    public static void main (String[] args) {
        person p1=new person();
        person p2=new person("娄爸爸",18);
        p1.show();
        p2.show();
        p1.setAge(15);
        p1.setName("爸爸");
        System.out.println(p1.getName()+p1.getAge());
        p1.show();
    }
}
class person{
    private String name;
    private int age;
    public person(){
        System.out.println("空构造");
    }
    public person(String name,int age) {
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println(name+age);
    }
}

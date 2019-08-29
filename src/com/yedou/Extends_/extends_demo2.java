package com.yedou.Extends_;

public class extends_demo2 {
    public static void main(String[] args) {
        student s1=new student();
        s1.setName("张三");
        s1.setAge(22);
        s1.eat();
        System.out.println(s1.getName()+s1.getAge());
        System.out.println("?????????????????????????");
        student s2=new student("李四",24);
        System.out.println(s2.getName()+s2.getAge());
        s2.study();
    }

}
class person{
    private String name;
    private int age;
    public person(){}
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void  eat(){
        System.out.println("吃饭");
    }
}
class student extends person{
    public student(){}
    public student(String name,int age) {
        super(name,age);
    }
    public void study(){
        System.out.println("学生学习");
    }
}
class teacher extends person{
    public teacher() {}
    public teacher(String name,int age) {
        super(name,age);
    }
    public void teache(){
        System.out.println("老师教课");
    }

}
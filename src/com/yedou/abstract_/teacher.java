package com.yedou.abstract_;

public class teacher {
    public static void main(String[] args) {
        BaseTeacher bt =new BaseTeacher("LXL",21);
        bt.teach();
    }
}
abstract class teacher_{
    private String name;
    private int age;
    public teacher_(){}
    public teacher_(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public abstract void teach();

}
class BaseTeacher extends teacher_{
    public BaseTeacher(){}
    public BaseTeacher(String name,int age){
        super(name,age);
    }
    public  void teach() {
        System.out.println("我的姓名是"+this.getName()+"我的年龄是"+this.getAge()+"我是基础班的老师");
    }
}
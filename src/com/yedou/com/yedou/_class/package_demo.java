package com.yedou.com.yedou._class;

public class package_demo {
    public static void main(String[] args) {
        student p=new student();
//        p.age=90;
//        p.name="傻逼";
//        System.out.println(p.age);
//        System.out.println(p.name);
//        p.speak();
        p.setAge(18);
        p.getAge();
        System.out.println(p.getAge());
    }
}
 class student {
        String name;
        private int age;
        public void setAge(int a) {
            if (a>0 && a<200) {
                age=a;
            }else {
                System.out.println("傻逼输错了");
            }
        }
        public int getAge() {
            return age;
        }

        public void speak() {
            System.out.println("我在说话");
        }
}


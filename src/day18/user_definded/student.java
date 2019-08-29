package day18.user_definded;

import java.util.Objects;

public class student implements Comparable<student>{
    private String name;
    private int age;

    public student() {
        super();
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(student o) {
        int num = this.age - o.age;   //按照年龄比较
        return num == 0 ? this.name.compareTo(o.name) : num;  //再按姓名比较
    }
}

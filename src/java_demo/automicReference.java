package java_demo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 原子引用
 * AtomicReference
 */
public class automicReference {
    public static void main(String[] args) {
        user us1 = new user("z3",21);
        user us2 = new user("li4",23);
        AtomicReference<user> atomicReference = new AtomicReference<>();
        atomicReference.set(us1);
        System.out.println(atomicReference.compareAndSet(us1,us2)+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(us1,us2)+atomicReference.get().toString());

    }
}

class user{
     String name;
     int age;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package java_demo;
/**
 * CAS的案列演示
 * AtomicInteger.compareAndSet()
 */

import java.util.concurrent.atomic.AtomicInteger;

public class CASdemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        boolean b = atomicInteger.compareAndSet(5, 2018);
        boolean a = atomicInteger.compareAndSet(5, 2019);
        System.out.println(b+"\tcurrent data"+atomicInteger.get());
        System.out.println(a+"\tcurrent data"+atomicInteger.get());

    }
}

package java_demo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全问题
 *
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        //ListNotSafe();  //list线程不安全方法
        //SetNotSafe();   //Set线程不安全方法
Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i <20; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));//生成表示符并切割
                System.out.println(map);
            },String.valueOf(i)).start();
        }

    }

    public static void SetNotSafe() {
        //Set<String> set =Collections.synchronizedSet(new HashSet<>());
        Set<String> set =new CopyOnWriteArraySet<>();
        for (int i = 0; i <20; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));//生成表示符并切割
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }

    public static void ListNotSafe() {
        //List<String> list = Collections.synchronizedList(new ArrayList<>());

        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i <20; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));//生成表示符并切割
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}

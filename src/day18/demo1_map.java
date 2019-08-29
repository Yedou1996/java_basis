package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class demo1_map {
    public static void main(String[] args) {
        //demo1(); //map集合存储元素
        //demo2();  //删除和判断是否包含
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",21);
        map.put("李四",22);
        map.put("王五",23);
        map.put("赵六",24);
        Collection<Integer> c =map.values();    //获取map集合中所有value的值
        System.out.println(c);
        System.out.println(map.size());    //map集合的长度
    }

    public static void demo2() {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",21);
        map.put("李四",22);
        map.put("王五",23);
        map.put("赵六",24);

        // Integer value = map.remove("赵六");   //map集合删除元素时返回的是键对应的值
        //System.out.println(value);
        System.out.println(map.containsKey("王五"));   //判断是否包含传入的键
        System.out.println(map.containsValue(22));   //判断是否包含传入的值
    }

    public static void demo1() {
        Map<String,Integer> map = new HashMap<>();
        Integer i1 = map.put("张三",23);
        Integer i2 = map.put("李四",24);
        Integer i3 = map.put("张三",26);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);        //map重复时返回的是被覆盖的值
    }
}

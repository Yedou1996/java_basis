package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo2_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",21);
        map.put("李四",22);
        map.put("王五",23);
        map.put("赵六",24);

        Integer i = map.get("张三"); //根据键获取值
        System.out.println(i);

//        Set<String> s = map.keySet();   //获取所有的键
//        Iterator<String> it =s.iterator();   //获取迭代器
//        while (it.hasNext()) {
//            String key = it.next();    //获取每一个键
//            Integer value = map.get(key);   //更具键获取值
//            System.out.println(key+"="+value);

        for (String key:map.keySet() //获取所有的键
             ) {
            System.out.println(key+"="+map.get(key));    //根据键获取值
        }        

    }
}

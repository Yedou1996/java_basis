package day18;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class  demo3_Iterator {                    //两种遍历方法，一种是通过keySet方法获得所有的键值，再通过get(键值)来获取值。一种是通过entrySet方法把键和值一起封装成对象，通过getkey，和getvalue来获取对应的键和值
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",21);
        map.put("李四",22);
        map.put("王五",23);
        map.put("赵六",24);
//        //map.entry说明entry是map的内部接口，将键和值封装成了entry对象，并存储在Set集合中
//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//        //获取每一个对象
//        Iterator<Map.Entry<String,Integer>> it =entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String,Integer>   entry = it.next();
//            String s =entry.getKey();
//            Integer I =entry.getValue();
//            System.out.println(s+"="+I);
//        }
        for (Map.Entry<String,Integer> en: map.entrySet()
             ) {
            System.out.println(en.getKey()+"="+en.getValue());
        }

    }
}

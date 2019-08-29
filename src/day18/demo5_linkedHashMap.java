package day18;

import java.util.LinkedHashMap;

public class demo5_linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm =new LinkedHashMap<>();   //怎么存怎么取
        lhm.put("张三",21);
        lhm.put("李四",23);
        lhm.put("王五",23);
        System.out.println(lhm);
    }
}

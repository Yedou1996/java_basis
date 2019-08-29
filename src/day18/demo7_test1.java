package day18;

import java.util.HashMap;

public class demo7_test1 {        //通过双列集合获取字符串中每个字符出现的次数
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbdddddddddddsasccccccccccsadsa";
        char arr [] =str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : arr
             ) {
            if (!hm.containsKey(c)) {   //判断是否包含该键值
                hm.put(c,1);
            }else {
                hm.put(c,hm.get(c)+1);      //包含的话会覆盖值
            }
        }
        for (Character c:hm.keySet()   //获取所有键的集合
             ) {
            System.out.println(c+"="+hm.get(c));    //通过键获取值
        }
    }
}

package day18;

import java.util.HashMap;
import java.util.Hashtable;

/*
相同点：
    底层都是基于hash算法，都是行列集合。
区别：
    1.hashMap是线程不安全的，效率高，jdk1.2版本
     hashTable是线程安全的，效率低，jdk1.0版本
   2.hashMap可以存储null键和null值，
     hashTable不可以存储null值和null键
 */
public class demo9_HashTable {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put(null,21);
        hs.put("李四",null);
//        Hashtable<String,Integer> ht = new Hashtable<>();
//        ht.put("张三",null);
//        System.out.println(ht);
    }
}

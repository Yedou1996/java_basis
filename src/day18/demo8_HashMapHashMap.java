package day18;

import day18.user_definded.student;

import java.util.HashMap;

public class demo8_HashMapHashMap {   //hashMap嵌套hashMap
    public static void main(String[] args) {
        HashMap<student,String> hs1 = new HashMap<>();
        hs1.put(new student("张三",21),"上海");
        hs1.put(new student("李四",21),"北京");
        hs1.put(new student("王五",32),"深圳");
        hs1.put(new student("赵六",45),"昆明");
        HashMap<student,String> hs2 = new HashMap<>();
        hs2.put(new student("王一",211),"日本");
        hs2.put(new student("王二",213),"美国");
        hs2.put(new student("王三",325),"加拿大");
        hs2.put(new student("王四",452),"英国");

        HashMap<HashMap<student,String>,String> hm = new HashMap<>();
        hm.put(hs1,"第一个");
        hm.put(hs2,"第二个");
        for ( HashMap<student,String> hs: hm.keySet()    //获取第一第二个集合的键存入set集合   hs代表hs1和hs2
             ) {
            String value = hm.get(hs);     //用value来存第一第二个集合的值   value代表第一个和第二个
            for (student s: hs.keySet()    //分别获取hs1和hs2 的student键      s代表student对象
                 ) {
                String value2 = hs.get(s);   //通过键获取值地区存入value2；    value2代表地点
                System.out.println(value+"="+s+"="+value2);
            }

        }

    }
}

package day18;

import java.util.ArrayList;
import java.util.Collections;

public class demo11_test2 {      //集合模拟斗地主洗牌，发牌。
    public static void main(String[] args) {
        String num [] = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        String color [] = {"红桃","黑桃","方片","梅花"};
        ArrayList<String> poker = new ArrayList<>();
        for (String c:color
             ) {
            for (String n : num
                 ) {
                poker.add(c.concat(n));   //字符串拼接
            }
        }
        poker.add("大猫");   //添加大小猫
        poker.add("小猫");
        Collections.shuffle(poker);   //洗牌
        System.out.println("洗好的牌"+poker);
        System.out.println(poker.size());


        ArrayList<String> ni = new ArrayList<>();   //创建四个新的集合用于存储三个人牌和底牌
        ArrayList<String> ta = new ArrayList<>();
        ArrayList<String> me = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
//        for (int i = 0; i <poker.size() ; i++) {
//            if(i >=poker.size()-3) {         //获取三张底牌，最后三张是底牌
//                dipai.add(poker.get(i));
//            }else if (i % 3 ==0) {               //通过i的值来分配 给每个人牌
//                ni.add(poker.get(i));
//            }else  if (i % 3 == 1) {
//                ta.add(poker.get(i));
//            }else {
//                me.add(poker.get(i));
//            }
//        }
        System.out.println("你的牌"+ni);
        System.out.println("他的牌"+ta);
        System.out.println("我的牌"+me);
        System.out.println("底牌"+dipai);

    }
}

package day17;

import java.util.HashSet;
import java.util.Random;

public class demo4_test1 {    //产生10个1到20 的随机数，要求随机数不重复
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<10) {
            hs.add(r.nextInt(20)+1);
        }
        for (Integer hs1:hs
             ) {
            System.out.println(hs1);
        }
    }
}

package day14;

public class demo5_replaceAll {
    public static void main(String args[]) {
        String s = "wosh532inime532nde532b3234aba";
        String regex = "\\d";
        String s2 = s.replaceAll(regex,"");
        System.out.println(s2);
    }
}

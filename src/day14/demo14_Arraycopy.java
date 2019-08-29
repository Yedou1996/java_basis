package day14;

public class demo14_Arraycopy {
    public static void main(String args[]) {
        int src [] = {12,23,42,12};
        int dest [] = new int[src.length];
        System.arraycopy(src,0,dest,0,src.length);
        for (int i = 0;i<dest.length;i++) {
            System.out.println(dest[i]);
        }
    }
}

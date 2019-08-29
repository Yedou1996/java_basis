package day16;
//import static java.util.Arrays.sort;   //静态导入，可以直接sort.
import java.util.Arrays;

public class demo9_StaticImport {
    public static void main(String[] args) {
        int arr [] = {112,23,24,21,4214,124,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

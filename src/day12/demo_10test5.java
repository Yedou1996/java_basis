package day12;

public class demo_10test5 {
    public static void main(String aargs[]) {
        String max = "jaslxljadlxlasldlxl,aklsklxlxksdlalxlakskdlalxl";
        String min = "lxl";
        int count = 0;
        int index = 0;
        while ((max.indexOf(min))!=-1) {
            index=max.indexOf(min);
            count ++;
            max = max.substring(index+min.length());
        }
        System.out.println(count);

    }
}




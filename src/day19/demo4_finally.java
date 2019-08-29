package day19;

public class demo4_finally {
    public static void main(String[] args) { //finally里的内容一定会执行，用于释放资源，在io流操作和数据库操作中会见到
        try {
            System.out.println(10/0);
        }catch (Exception e) {
            System.out.println("除数为0了");
            return;
        }finally {
            System.out.println("看看我执行了没有");
        }

    }
}

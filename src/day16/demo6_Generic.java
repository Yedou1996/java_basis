package day16;

public class demo6_Generic {
    public static void main(String[] args) {

    }
    interface inter<T> {
        public void show(T t);
    }
//    class demo implements inter<String> {
//        @Override
//        public void show(String t) {
//            System.out.println(t);
//        }
//    }
    class demo<T> implements inter<T> {    //没有必要在实现接口的时候给自己的类加泛型
    @Override
    public void show(T t) {

    }
}
}

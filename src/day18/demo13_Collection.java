package day18;

public class demo13_Collection {
    /*
    List(存取有序，有索引，可以重复)
        ArrayList
        底层是数组实现的，线程不安全，查找和修改快，增删慢
        LinkedList
        底层是链表实现的，线程不安全，增删快，查改慢
        Vector
        底层是数组实现的，线程安全，增删查改都慢
    Set(存取无序，无索引，不可以重复)
        HashSet
        底层是Hash算法实现的
        LinkedHashSet
        底层是链表实现的，也可以保证元素的唯一性
        TreeSet
        底层是二叉树算法实现的   。自然排序，比较器排序，自然排序：实现comparable方法，重写compareTo方法。
                                                          比较器：new Comparator<student>() ，重写compare方法
                                                          A:自然排序：要在自定义类中实现Comparerable<T>接口  ，并且重写compareTo方法
                                                          B:比较器排序：在自定义类中实现Comparetor<t>接口，重写compare方法
   map
        hashMap
            底层是哈希算法，针对键
            LinkedHashMap
                底层是链表，针对键
            treemap
                底层是二叉树算法，针对键
           开发用HashMap比较多
     */
    public static void main(String[] args) {

    }
}

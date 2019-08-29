package day22;

import day22.user_defined.person;   //对象输出流

import java.io.*;
import java.util.ArrayList;
//序列化：将对象写到文件上

public class demo5_ObjectOutputStrem {
    public static void main(String[] args) throws IOException {
        //demo1();
        person p1 = new person("张三",21);
        person p2 = new person("李四",23);
        person p3 = new person("王五",24);
        person p4 = new person("赵六",25);
        ArrayList<person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ObjectOutputStream oos = new ObjectOutputStream(new  FileOutputStream("oos.txt"));
        oos.writeObject(list);
        oos.close();

    }

    public static void demo1() throws IOException {
        person p1 = new person("张三",21);
        person p2 = new person("李四",23);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);

        oos.close();
    }
}

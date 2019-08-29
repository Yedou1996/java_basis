package day22;

import day22.user_defined.person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//对象操作流，反序列化
public class demo6_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //demo1();
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("oos.txt"));
     ArrayList<person> list = (ArrayList<person>) ois.readObject();
        for (person i:list
             ) {
            System.out.println(i);
        }
        ois.close();
    }

         public static void demo1() throws IOException, ClassNotFoundException {
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
             person p1 = (person) ois.readObject();
             person p2 = (person) ois.readObject();
             //person p3 = (person) ois.readObject();   //当文件读取到末尾时会出现EOFException

             System.out.println(p1);
             System.out.println(p2);
             ois.close();
         }
     }

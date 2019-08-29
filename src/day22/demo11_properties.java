package day22;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class demo11_properties {
    public static void main(String[] args) throws IOException {
        //demo1();
        //demo2();
        Properties prop = new Properties();
        System.out.println("读取前："+prop);
       prop.load(new FileReader("config.properties"));
        System.out.println("读取后："+prop);
        prop.setProperty("tel","18387119283");
        prop.store(new FileWriter("config.properties"),"LXL");  //第二个参数是用来描述文件列表的，如果不描述，可以传null
        System.out.println("再次读取后："+prop);

    }

    public static void demo2() {
        Properties prop = new Properties();
        prop.setProperty("name","张三");
        prop.setProperty("tel","122114312321");
        System.out.println(prop);
        Enumeration en = prop.propertyNames();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();   //获取每一个键
            String value = prop.getProperty(key);
            System.out.println(value);

        }
    }

    public static void demo1() {
        Properties prop = new Properties();
        prop.put("张三",23);

        System.out.println(prop);
    }
}

package day12;

import java.util.Scanner;

public class demo5_test {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3;i++){
            System.out.println("请输入用户名");
            String userName = s.nextLine();
            System.out.println("请输入密码");
            String password = s.nextLine();
            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==2) {
                    System.out.println("错误次数上限，请明天再来");
                }else {
                    System.out.println("用户名或密码错误,"+"你还有"+(2-i)+"次机会");
                }
            }

        }
    }
}

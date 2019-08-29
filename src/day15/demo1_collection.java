package day15;

public class demo1_collection {
    public static void main(String[] args) {
            student[] arr =new student[5];
            arr[0] = new student("张三",23);
            arr[1] = new student("李四",21);
            arr[2] = new student("王五",22);
            arr[3] = new student("赵柳",24);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);    //collection

        }
    }
}


class student {
    private String name;
    private int age;

    public student(String name,int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
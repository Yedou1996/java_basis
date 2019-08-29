package day19;

public class demo3_throw {
    //编译时的错误必须抛出，运行时的可以不用抛出
    public static void main(String[] args) throws Exception {
            person p = new person();
            p.setAge(-15);
    }
}
class person{
    private String name;
    private int age;

    public person() {
        super();
    }

    public person(String name, int age) {
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

    public void setAge(int age) throws Exception {
        if (0<age && age<150){
            this.age = age;
        }else {
            throw new Exception("年龄非法");
        }

    }
}
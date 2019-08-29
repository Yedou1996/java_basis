package com.yedou.Inner_class;

public class Demo_Inner {
    public  static void main(String[] args) {
        outer.inner oi=new outer().new inner();
        oi.show();
    }

}
class outer{
    int name=10;
    class inner{
        int num =20;
        public void show(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(outer.this.name);
        }

    }
}

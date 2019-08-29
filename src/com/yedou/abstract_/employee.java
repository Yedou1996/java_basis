package com.yedou.abstract_;

public class employee {
    public static void main(String[] args) {
        coder c=new coder("LXL","1234",30000);
        c.work();
        manager m=new manager("LXL","333",999999,23423);
        m.work();
    }
}
 abstract class employe{
    private String name;
    private String id;
    private double salsry;
    public employe(){}
    public employe(String name,String id,double salsry){
        this.name=name;
        this.id=id;
        this.salsry=salsry;
    }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getId() {
         return id;
     }

     public void setSalsry(double salsry) {
         this.salsry = salsry;
     }

     public double getSalsry() {
         return salsry;
     }

     public abstract void work();
}
class coder extends employe{
    public coder(){}
    public coder(String name,String id,double salsry){
        super(name,id,salsry);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+this.getId()+this.getSalsry()+"hahah");
    }
}
class manager extends employe{
    int bonus;
    public manager(){}
    public manager(String name,String id,double salsry,int bonus){
        super(name,id,salsry);
        this.bonus=bonus;
    }

    @Override
    public void work() {
        System.out.println(this.getName()+this.getId()+this.getSalsry()+bonus+"嘻嘻嘻");
    }
}

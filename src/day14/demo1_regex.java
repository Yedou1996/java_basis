package day14;

public class demo1_regex {
    public static void main(String args[]) {
        System.out.println(checkQQ("1234056"));
    }
    public static boolean checkQQ(String qq) {
        boolean flag=true;
       if (qq.length()>=5  &&  qq.length()<=15){
           if (!qq.startsWith("0")){
             char [] arr=qq.toCharArray();
             for (int i=0;i<arr.length;i++){
                 char ch = arr[i];
                 if (!(ch>='0' && ch<='9')){
                        flag=false;
                        break;
                 }
             }
            }else {
               flag=false;
           }
       }else {
           flag=false;
       }
        return flag;
    }
}

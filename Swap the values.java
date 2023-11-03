import java.util.*;
class Swap{
    int a,b;
    void swap(int a, int b){
        this.a=a;
        this.b=b;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"b="+b);
    }
}
class Main{
    public static void main(String args[]){
        Swap s=new Swap();
        s.swap(2,3);
    }
}

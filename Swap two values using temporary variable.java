import java.util.*;
class Swap{
    int a,b;
    void swap(int a, int b){
        int temp=a;
        this.a=b;
        this.b=temp;
        System.out.println("a="+this.a+"b="+this.b);
    }
}
class Main{
    public static void main(String args[]){
        Swap s=new Swap();
        s.swap(2,3);
    }
}

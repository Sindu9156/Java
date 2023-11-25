import java.util.*;
interface Factorial{
    public int fact(int i);
}
class Main implements Factorial{
    public int fact(int j){
        if(j==1)
           return 1;
        else
           return j*fact(j-1);
    }
    public static void main(String args[]){
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        i=s.nextInt();
        Main ob=new Main();
        System.out.println("the factorial of"+ i +"is" +ob.fact(i));
        
    }
}

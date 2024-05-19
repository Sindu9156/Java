import java.util.*;
class Main{
  int a=0,b=1;
  int c;
    static void fib(int i){
      if(i>0){
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;
        fib(i-1);
      } 
    }
    public static void main(String ar[]){
        Scanner input=new Scanner(System.in) ;
         int n=input.nextInt();
        fib(n);
    }
} 

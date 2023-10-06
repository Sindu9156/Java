import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);


try{
 System.out.println("enter the dividened");
int n=sc.nextInt();
System.out.println("enter the divisor");
int a=sc.nextInt();
int c=n/a;
System.out.println("the quotient is "+c);
}
catch(ArithmeticException e){
     System.out.println(e);
} 
        
    }
}

import java.util.*;
class Main{
public static void main(String[] args){
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("enter the two values");
a=s.nextInt();
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping the values" +a+"" +b);
}} 

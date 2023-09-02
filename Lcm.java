import java.util.*;
class HelloWorld {
    static int r;
    static int gcd(int a,int b){
        r=a%b;
        if(r>0)
           b=gcd(b,r);
        return b;
    }
    public static void main(String[] args) {
        int a,b,c,lcm;
        Scanner s=new Scanner(System.in);
        
System.out.println("enter the value");
a=s.nextInt();
System.out.println("enter the value");
b=s.nextInt();
if(a<b){
    c=a;
    a=b;
    b=c;
} 
lcm=(a*b)/gcd(a,b);
System.out.println("lcm of "+a+" and "+b+" is "+lcm);


    }
}

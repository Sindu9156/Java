import java.util.*;
class HelloWorld {
    public static void main(String[] args) {

int n,sum=0,b;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
b=n;
for(int i=1;i<n;i++){
if(n%i==0)
sum+=i;

}
n=sum-b;
System.out.println(n);
if(n>0){
System.out.println(b+"is a abundance number ");
}

else{
System.out.println(b+"is not a abundance number ");
} 

    }
}

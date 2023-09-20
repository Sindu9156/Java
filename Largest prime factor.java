import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
int n,flag,c=0;
System.out.println("enter the value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=2;i<=n;i++){
   flag=0;
    for(int j=2;j<10;j++){
         if(i!=j & i%j==0){
            flag=1;
             break;
         }
    }
    if(flag==0){
      if(c<i)
         c=i;
    }
       
}
System.out.println(c);
    }
}

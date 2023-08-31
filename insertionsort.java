import java.util.*;
class HelloWorld {
    public static void main(String[] args){
int k,n,j;
Scanner s=new Scanner(System.in);
System.out.println("enter the total value");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the  values");
for(int i=0;i<n;i++)
     a[i]=s.nextInt();
  
for(int i=1;i<n;i++){
k=a[i];
j=i-1;
while(j>=0 && a[j]>k){
     a[j+1]=a[j];
     j=j-1;
     
}

a[j+1]=k;
}

 for(int i=0;i<n;i++)
    System.out.println(a[i]);

    
    }
}

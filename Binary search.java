import java.util.*;
class HelloWorld {
    public static void main(String[] args){
int b,low=0,high,n,mid;
System.out.println("enter the total value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
high=n;
int a[]=new int[n];

System.out.println("enter the values");
for(int i=0;i<n;i++)
    a[i]=s.nextInt();


System.out.println("enter the value to be search");
b=s.nextInt();


while(low<=high){
mid=(low+high)/2;
if(a[mid]<b)
   low=mid+1;
   
 else if(a[mid]>b)
   high=mid-1;
 
 else if(a[mid]==b){
    System.out.println(b+" is found in position "+mid);
     break;
 }

}
    }
}

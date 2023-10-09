import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int n,flag=0,e;
Scanner sc=new Scanner(System.in);
System.out.println("enter the total value");
n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the values");
for(int i=0;i<n;i++)
     arr[i]=sc.nextInt();
System.out.println("enter the element to search");
e=sc.nextInt();
for(int i=0;i<n;i++){
if(arr[i]==e){
    flag=1;
    break;
}
}
if(flag==1)
System.out.println("the element is found");
else
System.out.println("the element is not found");


    }
}

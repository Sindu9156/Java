import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
int n,pos=-1,e;
System.out.println("\n enter the total value");
n=sc.nextInt();
int[] arr=new int[n];
System.out.println("\n enter the values");
for(int i=0;i<n;i++)
  arr[i]=sc.nextInt();
if(n>=0){
System.out.println("\n enter the value to delete");
e=sc.nextInt();
for(int i=0;i<n;i++)
{
    if(arr[i]==e)
        pos=i;
}
if(pos==-1)
  System.out.println("the given element not in the array");
else{
for(int i=pos;i<n-1;i++){
    arr[i]=arr[i+1];
}
n--;
System.out.println("after the deletion the array");
for(int i=0;i<n;i++)
   System.out.println(arr[i]);
}
}
else
System.out.println("underflow");

    }
}

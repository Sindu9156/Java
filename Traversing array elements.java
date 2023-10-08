import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the total number of values");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the values");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("the array values are ");
for(int i=0;i<n;i++)
System.out.println(arr[i]);


    }
}

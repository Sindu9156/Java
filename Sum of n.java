import java.util.Scanner;
class Main{
 static int sum(int n){
if(n==1)
    return 1;
else
    return n+sum(n-1);
} 
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("sum is", sum(n));
        
}
} 

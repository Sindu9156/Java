import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%4==0)
            System.out.println("multiples of 4");
        else
             System.out.println("not a multiples of 4");
        
}
} 
 

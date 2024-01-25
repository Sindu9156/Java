import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%3==0)
            System.out.println("it is multiples of 3");
        else 
            System.out.println("it is not a multiples of 3");
}
} 

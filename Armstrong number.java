import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int n, rem, sum=0, s;
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        s=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);
        }
        if(s==sum) 
            System.out.println("armstrong number");
        else
            System.out.println("not a armstrong number");
} 
}

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int number1;
        System.out.println("enter the value ");
        Scanner input=new Scanner(System.in);
        number1=input.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(number1+"*"+i+"="+(number1*i)); 
    }
}

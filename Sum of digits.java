public class Main
{
public static void main (String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the value");
int num =input.nextInt();
int sum = 0;
while(num!=0){
sum += num % 10;
num = num / 10;
}

System.out.println ("Sum of the digits : " + sum);
}

}

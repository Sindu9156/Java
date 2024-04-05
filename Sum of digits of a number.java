import java.util.*;
public class Main
{
public static void main (String[]args)
{

int sum = 0;
Scanner input=new Scanner(System.in);
int n=input.nextInt();
while(n!=0){
sum += n % 10;
n = n/ 10;
}


System.out.println ("Sum of digits : " + sum);
}}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      int number1;
      int number2;
      int number3;
      System.out.println("enter the three numbers");
      Scanner input=new Scanner(System.in);
      number1=input.nextInt();
      number2=input.nextInt();
      number3=input.nextInt();
      System.out.println("hai,java");
      System.out.println(number1+number2);
      if(number1>number2){
          if(number1>number3){
              System.out.println("big number is"+number1);
          }
      } 
      else if(number2>number3) {
              System.out.println("big number is"+number2);
      }
      else{
          System.out.println("big number is"+number3);
      }
    } 
}

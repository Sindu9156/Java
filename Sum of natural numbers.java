import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
     
    Scanner input=new Scanner(System.in);
    System.out.println("enter the value");
    int n =input.nextInt();
    int sum =Sum(n);
    System.out.println (sum);
  }

  static int Sum (int n)
  {
    if (n == 0)
      return n;

    return n + Sum(n - 1);
  }
}

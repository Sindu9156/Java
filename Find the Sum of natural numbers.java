import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input=new Scanner(System.in);
    int n = input.nextInt();
    int sum = getSum (n);

      System.out.println (sum);
  }

  static int getSum (int n)
  {
    if (n == 0)
      return n;

    return n + getSum (n - 1);
  }
}

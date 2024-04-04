public class Main
{
  public static void main (String[]args)
  {
   Scanner input=new Scanner(System.in);
    int n = input.nextInt();
    int s = Sum (n);
System.out.println (s);
  }
  static int Sum (int n)
  {
    if (n == 0)
      return n;
    return n + Sum (n - 1);
  }
}

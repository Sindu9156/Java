public class Fibonacci{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the value");
    int n=input.nextInt();
    int a = 0, b = 1,c;
System.out.print(a + " , " + b + " , ");
for (int i = 2; i < n; i++) {
      c= a + b;
      a = b;
      b = c;
      System.out.print(c + " , ");
    }
} 
} 

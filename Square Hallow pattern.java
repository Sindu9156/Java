import java.util.*;

public class Main {
    public static void Pattern(int n)
    {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
       int n = input.nextInt();
       Pattern(n);
    }
}

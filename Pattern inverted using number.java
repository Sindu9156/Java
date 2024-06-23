import java.util.*;

public class Main {
    public static void Pattern(int n)
    {
        int i, j;
        for (i = n; i >= 1; i--){
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    
    public static void main(String args[])
    {
         Scanner input =new Scanner (System.in);
        int n = input.nextInt();
        printPattern(n);
    }
}

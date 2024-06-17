import java.util.*;

public class Main {
    public static void Pattern(int n)
    {
        int i, j;
        int num = 1;
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
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

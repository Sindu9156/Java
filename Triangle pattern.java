import java.util.*;

public class trianglepattern{
    
    public static void pattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }

    
    public static void main(String args[])
    {
       Scanner input=new Scanner(System.in) ;
        int n=input.nextInt() ;
        pattern(n);
    }
}

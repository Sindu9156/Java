import java.util.*;
class main{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0|j==0|j==n-1|i==n-1)
                     System.out.print("*");
                else
                   System.out.print(" ");
            }
           System.out.println("");
        }
    }
}

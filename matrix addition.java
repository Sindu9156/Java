import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int r,c;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number of row");
       r=s.nextInt();
          System.out.println("enter the number of column");
            c=s.nextInt();
          int a[][]=new int[r][c];
          int b[][]=new int[r][c];
             System.out.println("Enter the values");
             for(int i=0;i<r;i++){
                 for(int j=0;j<c;j++){
                     a[i][j]=s.nextInt();
                 }
             }
             for(int i=0;i<r;i++){
                 for(int j=0;j<c;j++){
                     b[i][j]=s.nextInt();
                 }
             }
               for(int i=0;i<r;i++){
                 for(int j=0;j<c;j++){
                     a[i][j]+=b[i][j];
                 }
             }
               for(int i=0;i<r;i++){
                 for(int j=0;j<c;j++){
                    System.out.print(a[i][j]+" ");
                    
                 }
                 System.out.print("\n");
             }
    }
}

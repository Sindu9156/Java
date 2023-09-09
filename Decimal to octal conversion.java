import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int dec,oct,r,i=0;
        int[] a=new int[30];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal value ");
        dec=sc.nextInt();
        while(dec>0){
            r=dec%8;
            a[i]=r;
            i++;
            dec=dec/8;
            
        }
        System.out.println("the octal value is");
        for(int j=i-1;j>=0;j--)
            System.out.print(a[j]);
        
    }
}

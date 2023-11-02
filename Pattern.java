import java.util.*;
class box{
    static void star(int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            } 
            System.out.println("");
        }
    }
    public static void main(String[] args) {
       
       System.out.println("enter the value ");
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       star(n);
       
    }

}

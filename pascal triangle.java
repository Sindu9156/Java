import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++)
               System.out.print(" ");
            
            for(int k=1;k<i;k++){
              if(k==1){
                  System.out.print(1+" ");
              }
              else{
                  System.out.print((i-1)+" ");
              }
                  
              }
            System.out.print(1);
            
            System.out.print("\n");    
           
     
              
            
        }
    }
}
 

import java.util.*;
interface Prime{
    public void prime(int i);
}
class Main implements Prime{
    public void prime(int i){
        int flag=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
               flag++;
        }
        if(flag==2)
            System.out.println("it is a prime number");
        else
            System.out.println("it is not a prime number");
    }
    public static void main(String args[]){
        int k;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        Main obj=new Main();
        k=s.nextInt();
        obj.prime(k);
    }
}

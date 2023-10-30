import java.util.*;
interface Prime{
    public void prime(int i);
}
class Main implements Prime{
    public void prime(int i){
        int flag=0;
        for(int j=1;j<=(i/2);j++){
            if(i%j==0)
               flag=1;
        }
        if(flag==1)
            System.out.println("it is a prime number");
        else
            System.out.println("it is not a prime number");
    }

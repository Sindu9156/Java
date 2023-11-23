import java.util.*;
class Year{
    void leap(int y){
        if(y%4==0||y%400==0)
           System.out.println("the year"+ y +"is leap year");
        else
            System.out.println("the year"+ y +"is not a leap year");
    }
}
class Main extends Year{
    public static void main(String args[]){
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        i=s.nextInt();
        Main ob=new Main();
        ob.leap(i);
        
  } 
}

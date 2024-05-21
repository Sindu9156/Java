import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str= sc.next();
        if(str.charAt(0)>='a' & & str.charAt(0)<='z')
            System.out.println(str.toLowerCase());
       else if(str.charAt(0)>='A' & & str.charAt(0)<='Z')
            System.out.println(str.toUpperCase()); 


           }
   
  
}

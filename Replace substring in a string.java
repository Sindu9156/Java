import java.util.*;
public class Main {
public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.print("Enter a String : ");
     String s1 = input.nextLine();
     System.out.print("Enter the String to be replaced : ");
     String oldStr = input.nextLine();
     System.out.print("Enter the new String : ");
     String newStr =input.nextLine();

     String replaceStr= s1.replace(oldStr, newStr);
     System.out.println("New String is :"+replaceStr);
   }
}

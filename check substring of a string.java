import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s,sub;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        System.out.println("enter the substring");
        
        
        sub=sc.nextLine();
        i=s.indexOf(sub);
        if(i>=0)
            System.out.println(sub+" is a substring of "+s);
        
    }
}

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        c=s;
        s=s.replaceAll("[^a-zA-Z]+", " ");
        System.out.println("the string "+c+" is after removing special characters "+s);
    }
}

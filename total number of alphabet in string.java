import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String s;
        int count=0;
        System.out.println("enter the string ");
        Scanner sc=new Scanner (System.in );
        s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)))
                count++;
        }
        System.out.println("the total number of alphabet in string is "+count);
    }
}

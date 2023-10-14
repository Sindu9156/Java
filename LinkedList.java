import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
LinkedList<Integer> list=new LinkedList<Integer>();
Scanner s=new Scanner(System.in);
System.out.println("enter the total number of values");
int n=s.nextInt();
System.out.println("enter the values");
for(int i=0;i<n;i++)
     list.add(s.nextInt());
System.out.println(list);

    }
}

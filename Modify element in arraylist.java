import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of values");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
       
        arr.set(0,100);
        System.out.println(arr);
        
    }
}

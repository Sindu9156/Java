class Main{
    int fib(int i){
        if(i<=1)
           return i;
        else
           return fib(i-1)+fib(i-2);
    }
    public static void main(String ar[]){
        Main ob=new Main();
        System.out.println(ob.fib(3));
    }
} 

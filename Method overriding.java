class Main{
    void print(){
        System.out.println("inside main");
    }
    public static void main(String args[]){
        Main obj=new Main();
        obj.print();
        A obj1=new A();
        obj1.print();
    }
    
}
class A extends Main{
    void print(){
        System.out.println("inside A");
    }
}

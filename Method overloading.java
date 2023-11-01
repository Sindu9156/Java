class Main{
    void show(){        System.out.println("main");
    }
    void show(int i){
        System.out.println("B");
    } 
    public static void main(String args[]){
        Main s=new Main();
        s.show();
    }
}

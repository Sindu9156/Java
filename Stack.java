class stack{
    static int tos;
    static int s[]=new int[10];
    stack(){
           tos=-1;
    }
       static void push(int item){
           if(tos>=9)
              System.out.println("overflow");
           else
              s[++tos]=item;
       }
       static int pop(){
           if(tos==-1){
              System.out.println("underflow");
              return 0;
           } 
           else
              return s[tos--];
       }        
            
    public static void main(String[] args) {
       
       
       push(5);
       System.out.println(pop());
    }

}

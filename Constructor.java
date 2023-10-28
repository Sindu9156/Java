import java.util.*;
class box{
    double width;
    double height;
    double depth;
    box(double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    double volume(){
        return width*height*depth;
    }
    
}
class b{
    public static void main(String args[]){
         box mybox1=new box(12,1,1);
         box mybox2=new box(13,1,1);
         System.out.println("the vol is" +mybox1.volume());
         System.out.println("the vol is" +mybox2.volume());
         
    } 

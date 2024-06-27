class Vehicle{
  public void method() {
    System.out.println("The vehicle is driving");
  }
  
}

class Car extends Vehicle{
  public void method() {
    System.out.println("The car is driving");
    
  }
}

class Bike extends Vehicle{
  public void method() {
    System.out.println("The bike is driving");
  }
}
class Main{
public static void main(String[] args){
Vehicle obj=new Vehicle();
Vehicle obj1=new Car();
Vehicle obj2=new Bike();
obj.method();
obj1.method();
obj2.method();
}} 

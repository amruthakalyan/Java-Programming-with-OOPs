// Interface :  it is a class in which it contains all abstract methods
//Hiding the implementation and showing the abstraction gets 100% abstraction
//Using concept of INTERFACES we can achieve multiple inheritance in java.

interface Example{
  void sayHi();
  void sayHello();
}
interface Example1{
    void dayGreetings();
}
class ExampleOne implements Example ,Example1{
     public void sayHi(){
        System.out.println("Implementation for sayHi method");
     }

    public  void sayHello(){
        System.out.println("Implementation for sayHello method");
     }
     public void sayGreething(){
        System.out.println("This is sayGreething method");
     }
}
public class Interfaces {
    public static void main(String[] args){
        ExampleOne e = new ExampleOne();
        e.sayHello();
        e.sayHi();
        e.sayGreething();
    }
}

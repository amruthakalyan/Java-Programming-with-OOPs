//Method Overloading: more than one method with same name
//Polymorphism: two types: 1.Static Polymorphism(Method Over-loading/Compile time) 2.Dynamic  Polymorphism(Method Over-Riding/Run-time)
package OOPS;
class Method_overloading_one{
     void sum(int a,int b){
        System.out.println(a+b);
     }
     void sum(int a,int b,int c){
        System.out.println(a+b);
     }
     void sum(float a,float b){
        System.out.println(a+b);
     }
}
public class Method_overloading {
    public static void main(String[] args) {
        Method_overloading_one one = new Method_overloading_one();
        one.sum(20,30);
        one.sum(10,20,30);
        one.sum(1.2f,3.4f);
    }
}

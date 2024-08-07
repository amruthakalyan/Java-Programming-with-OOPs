// Method_OverRidinga: same name and same parameters 
package OOPS;
class One{
    void sayHi(){
        System.out.println("HI from one");
    }
}
class Two extends One{
    void sayHi(){
        System.out.println("HI  from two");
    }
}
public class Method_OverRiding {
    public static void main(String[] args) {
        One t= new One();
        t.sayHi();
    }
}

// Inheritance : Acuaring the properties of parent to the child (or) Creating new classes by using Existing classes.
//Types:
// 1.Single Inheritance - class(A)--->class(B)
// 2.Multi-Level Inheritance - class(A)--->class(B)--->class(C)
// 3.Multiple Inheritance - class(C)--->class(A,B) java doesnot support multiple inheritence
// 4.Hierarchichal Inheritance - class(A)-->class(B) && class(A)-->class(C)
// 5.Hybrid Inheritance - combination of any two inheritances except multiple inheritance.

package OOPS;
class One{
    int a,b;
    One(){
        a=10;
        b=20;
    }
    void showAB(){
        System.out.println("a="+ a + " " + "b="+b);
    }
}
class Two extends One{
    int c,d;
    Two(){
       c=30;
       d=40;
    }
    void showCD(){
        System.out.println("c="+c + " "+ "d="+d);
    }
}
class Three extends One{
    void showData(){
        // showAB();
        // showCD();
        System.out.println("HII");
    }
}
class Four extends One{
    void show(){
        showAB();
         System.out.println("Bye");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // One s = new One();
        // Two s = new Two();
        // Three s = new Three();
        // s.showCD(); s.showAB();
        // s.showData();
        Four s = new Four();
        s.show();
       
    }
}

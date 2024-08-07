// Constructor is a method that is invoked automatically whenever object is created 
// -used to initialize the member data
//it is the rule in java that every class should have atleast one constructor
package OOPS;
// import java.util.Scanner;
class constructorOne{
    int a ,b;
    //Default Constructor(no parameters)
   constructorOne(){
       a=10;
       b=20;
    }
    //Parameterized Constructor(with parameters)
    // constructorOne(int x ,int y){
    //     a=x;
    //     b=y;
    //  }
    void showData(){
        System.out.println("a="+a + " "+ "b="+ b);
    }
}
class constructor{
    public static void main(String[] args) {
        constructorOne one = new constructorOne();
        one.showData();
    }
}



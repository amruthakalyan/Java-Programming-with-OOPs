package OOPS;
public class MyClass {
    private int myNumber;
    private String myString;

    // Constructor with two parameters
    public MyClass(int number, String str) {
        myNumber = number;
        myString = str;
    }

    // Constructor with one parameter
    public MyClass(String str) {
        myString = str;
    }

    // Default constructor with no parameters
    public MyClass() {
        // Default initialization
        myNumber = 0;
        myString = "Default";
    }

    // Getter methods
    public int getMyNumber() {
        return myNumber;
    }

    public String getMyString() {
        return myString;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        MyClass obj1 = new MyClass(10, "Hello");
        MyClass obj2 = new MyClass("World");
        MyClass obj3 = new MyClass();

        // Displaying object properties
        System.out.println("Object 1: Number - " + obj1.getMyNumber() + ", String - " + obj1.getMyString());
        System.out.println("Object 2: String - " + obj2.getMyString());
        System.out.println("Object 3: Number - " + obj3.getMyNumber() + ", String - " + obj3.getMyString());
    }
}

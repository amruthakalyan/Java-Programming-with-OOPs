// Abstract classes are hiding the implementation and showing the method
// we cannot achieve 100% abstraction using abstract classes 
// for this we use concept called interfaces

abstract class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    abstract void makeSound(); // Abstract method without implementation
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy"); // Instantiating a Dog object using the Animal reference
        myDog.makeSound(); // Output: Woof!
        myDog.sleep();     // Output: Buddy is sleeping
    }
}


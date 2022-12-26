package Basic.OOP.InheritanceExample.Abstraction;

public class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;

    // Method overriding - Declaring method in sub class
    //                     Which is alredy in parent class
    @Override // not necessary but allows clarification
    void go(){
        System.out.println("Your Bicycle is moving");
    }

    //  Here is our abstract method from vehicle class that we have to implement
    @Override
    void move(int miles) {
        System.out.println("You moved " + miles + " miles");
    }
    
}

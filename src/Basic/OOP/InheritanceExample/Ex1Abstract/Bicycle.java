package Basic.OOP.InheritanceExample.Ex1Abstract;

public class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;

    // Method overriding - Declaring method in sub class
    //                     Which is alredy in parent class
    @Override // not necessary but allows clarification
    void go(){
        System.out.println("Your Bicycle is moving");
    }

    @Override
    void move(int miles) {
        // TODO Auto-generated method stub
        System.out.println("You moved " + miles + " miles");
    }
    
}

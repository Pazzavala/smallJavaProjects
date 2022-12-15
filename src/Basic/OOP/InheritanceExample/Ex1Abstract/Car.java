package Basic.OOP.InheritanceExample.Ex1Abstract;

public class Car extends Vehicle {

    // Encapulation - attributes of a class will be hidden or private,
    //                can be accessed only through methods (getters & setters)
    //                You should make attributes private if no reason to be public/ proected.   

    private String make = "Buick";
    private String model = "Verano";
    private int year = 2013;
    private String color = "White";
    private int milage = 67098;
    double price = 15000.00;
    int wheels = 4;
    int doors = 4;

    public Car() {}

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    //  Here is our abstract method from vehicle class
    @Override
    void move(int miles) {
        // TODO Auto-generated method stub
        milage += miles;
    }

    public void drive(int miles) {
        System.out.println("You drove " + miles + " miles");
        System.out.println("Your milage is now at: " + (this.milage + miles));
    }

    public void brake() {
        System.out.println("Your stopped driving");
    }


    // Even though our attributes are orivate we can see them using this method.
    void info() {
        System.out.printf("\nMake & Model: %s %s %s %d\n\n",
         this.color, this.make, this.model, year);
    }

    // or most of time use toString() this is 
    // called by print to display as a string
    // by default its the memory adress
    public String toString() {
        String myString = make + "\n" + model + "\n" + year + "\n" + color;
        return myString;
    }

    
}

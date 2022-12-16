package Basic.OOP.InheritanceExample.Abstraction;

public class Car extends Vehicle {

    // Encapsulation - attributes of a class will be hidden or private,
    //                can be accessed only through methods (getters & setters)
    //                You should make attributes private if no reason to be public/ protected.

    private String make = "Buick";
    private String model = "Verano";
    private int year = 2013;
    private String color = "White";
    private int milage = 67098;
    double price = 15000.00;
    int wheels = 4;
    int doors = 4;

    public Car() {}

    // making a constructor to copy an object
    public Car(Car car) {
        this.copy(car);
    }

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

    public void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }

    //  Here is our abstract method from vehicle class that we have to implement
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getYear() {
        return this.year;
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

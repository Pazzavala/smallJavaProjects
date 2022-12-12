package Basic.OOP;

public class Car {
    private String make = "Buick";
    private String model = "Verano";
    private int year = 2013;
    private String color = "White";
    private int milage = 67098;
    double price = 15000.00;

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

    public void drive(int miles) {
        System.out.println("You drove " + miles + " miles");
        System.out.println("Your milage is now at: " + (this.milage + miles));
    }

    public void brake() {
        System.out.println("Your stopped driving");
    }

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

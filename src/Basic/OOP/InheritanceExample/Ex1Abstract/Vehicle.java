package Basic.OOP.InheritanceExample.Ex1Abstract;

public abstract class Vehicle {
    double speed;

    // abstract - abstract classes can not be instanciated, but they can have a subclass
    //            abstract methods are declared without an implementation

    // This is a absract method we cant add a body here
    // but our subclasses are forced to implement this
    abstract void move(int miles);

    void go() {
        System.out.println("This vehicle is moving");
    }

    void stop() {
        System.out.println("This vehicle stopped moving");
    }

}

package Basic.OOP.Poly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Polymorphism - The ability of an object to identify as more than one type

        Car car = new Car(); // identifiers as Car but also a Vehicle
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

//        Cant do Car racers = {car, bicycle, boat};
        Vehicle[] racers = {car, bicycle, boat};

        car.go();
        bicycle.go();
        boat.go();

        System.out.println();

        for(Vehicle v: racers)
            v.go();

//        dynamic Polymorphism - Object taking many shapes/forms after compilation (during run time)

        Scanner in = new Scanner(System.in);
        Animal pet;

        System.out.println("What animal do you want?");
        System.out.println("1 - Dog\n2 - Cat");
        int choice = in.nextInt();

        if(choice == 1)
            pet = new Dog();
        else if(choice == 2)
            pet = new Cat();
        else {
            pet = new Animal();
            System.out.println("Not valid");
        }

        pet.speak();



    }
}

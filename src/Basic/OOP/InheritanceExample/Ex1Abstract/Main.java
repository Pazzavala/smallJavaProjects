package Basic.OOP.InheritanceExample.Ex1Abstract;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bicycle bike = new Bicycle();

        // We can call an create a vehicle object but we may not want to bc
        // its not somethings wed like used as an obejct bc its abstract.
        // When adding the word abstract we cant craeate an object of vehicle
        // Vehicle vehicle = new Vehicle();

        Car[] allCars = new  Car[3];
        Garage myGarage = new Garage();

        // These both have these methods bc they inherited Vehicle
        bike.go();
        bike.stop();
        myCar.go();


        myCar.drive(89);
        myCar.brake();
        myCar.info();

        System.out.println("\n" + myCar.price + "\n");

        Car yourCar = new Car("Ford", "Mustang", 2018, "Red");
        yourCar.info();

        Car otherCar = new Car("Honda", "Civic");
        System.out.println("\n" + otherCar + "\n");

        allCars[0] = myCar;
        allCars[1] = yourCar;
        allCars[2] = otherCar;

        myGarage.park(myCar);

        System.out.println("\n" + allCars[0]);

    }
}

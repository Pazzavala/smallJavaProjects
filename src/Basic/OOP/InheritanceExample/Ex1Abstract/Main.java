package Basic.OOP.InheritanceExample.Ex1Abstract;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bicycle bike = new Bicycle();

        Car otherCar = new Car("Honda", "Civic");
        Car yourCar = new Car("Ford", "Mustang", 2018, "Red");

        // Making a copy of other car
        Car car2 = new Car();

        // Cant copy objects like this
        car2 = myCar;   // This just sets two nvaiables pointing to same object

        // This is how we would do it by creating our own copy method.
        car2.copy(otherCar);

        // This is how we would do it with a copied constructer.
        //  Withing this constructer we would pass the car we want to copy
        Car car3 = new Car(yourCar);

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

        yourCar.info();

        System.out.println("\n" + otherCar + "\n");

        allCars[0] = myCar;
        allCars[1] = yourCar;
        allCars[2] = otherCar;

        myGarage.park(myCar);

        System.out.println("\n" + allCars[0]);

    }
}

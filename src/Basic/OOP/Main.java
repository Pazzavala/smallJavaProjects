package Basic.OOP;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car[] allCars = new  Car[3];
        Garage myGarage = new Garage();

        myCar.drive(89);
        myCar.brake();
        myCar.info();

        System.out.println(myCar.price);

        Car yourCar = new Car("Ford", "Mustang", 2018, "Red");
        yourCar.info();

        Car otherCar = new Car("Honda", "Civic");
        System.out.println(otherCar);

        allCars[0] = myCar;
        allCars[1] = yourCar;
        allCars[2] = otherCar;

        myGarage.park(myCar);

        System.out.println("\n" + allCars[0]);

        DiceRoller dice1 = new DiceRoller();

        dice1.roll();

    }
}

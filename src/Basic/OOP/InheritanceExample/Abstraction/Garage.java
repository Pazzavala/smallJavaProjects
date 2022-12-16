package Basic.OOP.InheritanceExample.Abstraction;

public class Garage {
    int numberOfCars = 0;

    void park(Car car) {
        this.numberOfCars++;
        System.out.println("The car " + car + "\nNow there is " 
        + this.numberOfCars + " Cars in the garage");
    }

}

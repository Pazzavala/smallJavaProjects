package Basic.OOP.Interfaces;

public class Fish extends Animal implements Prey, Predator {

    Fish() {
       super("Really hungry");
    }

    @Override
    void hungerLevel() {
        System.out.println("The Fish is low Hunger");
    }

    @Override
    public void hunt() {
        System.out.println("The Fish is hunting smaller fish");

    }

    @Override
    public void flee() {
        System.out.println("The Fish is fleeing from a larger Predator");
    }

    @Override
    public void eat() {

    }
}

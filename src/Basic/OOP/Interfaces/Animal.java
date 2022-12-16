package Basic.OOP.Interfaces;

public abstract class Animal {

    String hunger;

    Animal(String hunger) {
        this.hunger = hunger;
    }

    abstract void hungerLevel();
}

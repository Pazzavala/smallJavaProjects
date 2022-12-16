package Basic.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
//        interface - a template that can be applied to a class
//                    Similar to inheritance, but specifies what a class must do.
//                    classes can apply more than one interface, inheritance is limited to 1
        Rabbit rab = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rab.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
        fish.hungerLevel();
    }
}

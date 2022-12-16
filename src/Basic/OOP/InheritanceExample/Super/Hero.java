package Basic.OOP.InheritanceExample.Ex2Super;

public class Hero extends Person{
    String power;
    
    Hero(String name, int age, String power) {
        //  Its better if we pass name and age to supper class
        //  b/c thats where name and age is contained.
        super(name, age);
        this.power = power;
    }

    public String toString() {
        // since we alredy have a toString in person but we add power
        return super.toString() + this.power;
    }
    
}

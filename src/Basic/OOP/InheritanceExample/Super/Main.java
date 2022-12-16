package Basic.OOP.InheritanceExample.Super;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Supperman", 32, "Everything");

        System.out.println(hero1.name + "\n" + hero1.age + "\n" + hero1.power);
        System.out.println("\n" + hero2.toString());
    }
    
}

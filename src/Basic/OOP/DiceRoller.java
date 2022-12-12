package Basic.OOP;

import java.util.Random;

public class DiceRoller {

    Random rand = new Random();
    int number = 0;

    DiceRoller() {
        Random rand2 = new Random();
        int num = 0;
        roll();
        roll(num, rand2);
    }

    void roll() {
        number = rand.nextInt(6)+1;
        System.out.println(number);
    }
    
    void roll(int number, Random rand) {
        number = rand.nextInt(6)+1;
        System.out.println(number);
    }
}

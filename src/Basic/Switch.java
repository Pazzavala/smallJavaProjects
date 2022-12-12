package Basic;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number from 1 - 4: ");
        int input = Integer.parseInt(in.nextLine());

        switch(input) {
            case 1: System.out.println("You get M&M's");
                    break;
            case 2: System.out.println("You get a KitKat");
                    break;
            case 3: System.out.println("You get Nerds");
                    break;
            case 4: System.out.println("You get a Twix");
                    break;
            default: System.out.println("You get Nothing");
        }

        in.close();
    }
}

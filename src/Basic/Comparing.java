package Basic;
import java.util.Scanner;

public class Comparing {
    
    public static void main(String[] args) {
        // comparing an int
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1 to play and 0 to quit: ");
        int num = in.nextInt();
        in.nextLine();

        if (num == 1)
            System.out.print("Game Starting...");
        else if (num == 0)
            System.out.print("Game Ended...");
        else
            System.out.print("Not a valid response...");

        // Copmparing a string we use equals method
        System.out.print("\nNext round or press (q to quit): ");
        String input = in.nextLine();

        if (input.equals("q") || input.equals("Q"))
            System.out.print("\nYou QUIT the game");
        else 
            System.out.print("Your next round is starting!");    
        
        in.close();
    }
}
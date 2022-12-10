package Basic;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + "\nHow old are you?");
        int age = Integer.parseInt(in.nextLine());
        // Interger.parseInt turns the String into an int
        System.out.println("So you are " + age + " years old.");


        System.out.println("Enter your lastname: ");
        String lastname = in.nextLine();

        System.out.println("Hello " + name + " " + lastname + "\nWhat's your birth year?");
        Integer birthYear = Integer.valueOf(in.nextLine());
        // Interger.valueOf turns the String into an Integer object.
        System.out.println("So you were born in " + birthYear);

        // Another way would be to read in as int

        System.out.print("Eneter your favorite Video Game: ");
        String videoGame = in.nextLine();
        
        System.out.println(videoGame);
        System.out.print("How much does it cost?");
        int cost = in.nextInt();

        System.out.println(cost);

        System.out.print("What store do they sell it in?");
        // We have to use a another nextline b/c when we 
        // read cost as nextInt \n was left in our scanner
        in.nextLine();
        String store = in.nextLine();
         
        System.out.println(store);

        in.close();
    }
}
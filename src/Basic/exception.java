package Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
//    exception - an event that occurs during the execution of a program that,
//                disrupts the normal flow of instructions

    public static void main(String[] args) {
//        This is a try block which ties running our code and if encounters an exception it catches it

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a whole number to divide: ");
            int x = in.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = in.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
//      These are catch blocks that catch any exception that may happen in our code
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by ZERO!!!");
        } catch (InputMismatchException e) {
            System.out.println("Please ENTER A NUMBER");
        } catch (Exception e) { //  Exception Catches all types of exceptions
            System.out.println("Something went wrong");
        } finally { // Block that always runs
            System.out.println("This will always print");
        }

    }
}

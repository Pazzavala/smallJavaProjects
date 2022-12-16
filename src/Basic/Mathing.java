package Basic;

import java.util.Scanner;

public class Mathing {
    public static void main(String[] args) {

//        Anything with final keyword cant be changed later
        final double x = 3.14;
        double y = -10;

        //  Find max value
        double z = Math.max(x, y);

        System.out.println(z);
        // Get absolute value of -10
        System.out.println(Math.abs(y));

        // Square root
        System.out.println(Math.sqrt(9));

        // Rounded 3.14
        // Static method
        System.out.println(Math.round(x));

        // Ceiling of 3.14 -> 4
        System.out.println(Math.ceil(x));

        // floor of 3.14
        System.out.println(Math.floor(z));



        // Find hypotenuse of triangle

        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = in.nextDouble();
        System.out.println("Enter side b: ");
        b = in.nextDouble();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println(c);

        in.close();
    }
}

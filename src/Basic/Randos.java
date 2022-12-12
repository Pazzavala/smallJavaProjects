package Basic;
import java.util.Random;

public class Randos {
    public static void main(String[] args) {
        Random random = new Random();
        // This will give value between 0 - 5
        int x = random.nextInt(6) + 1;
        // We could add 1 if we wanted values for die 1 - 6

        double y = random.nextDouble();

        boolean c = random.nextBoolean();

        System.out.println(x + " " + y + " " + c);
    }
}

package Basic;

import java.text.DecimalFormat;

public class casting {

    public static void main(String[] args) {
        int cost = 10;

        System.out.println(cost);

        float costCents = (float) cost;

        System.out.println(costCents);

        float pi = 3.141593f;
        double golden = 1.6180339887;
        // Formatting your float value
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(pi));
        System.out.print(df.format(golden));
    }
}

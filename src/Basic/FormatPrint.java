package Basic;

import java.text.DecimalFormat;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class FormatPrint {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        String name = "MARIA";
        System.out.printf("I am %d years old", 22);

        // Final make our variable unchangeable
        final double FAV =  3.14;
        System.out.printf("My FAVorite number is %f or %s", FAV, df.format(FAV));
        
        // Width is amount of space we want our string to take up before
        System.out.printf("\nHello %10s", name);
        // Width is amount of space we want our string to take up after
        System.out.printf("\nHello %-10s", name);

        // Percision
        System.out.printf("My FAVorite number is %.3f", FAV);

        double money = 2323443.34;
        System.out.printf("\nYou have this much money %+.2f", money);
        System.out.printf("\nYou have this much money %023f", money);
        System.out.printf("\nYou have this much money %,.2f", money);

    }
}

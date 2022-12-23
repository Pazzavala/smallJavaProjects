package JavaSwing.Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("JFrame title goes here");
        // This will actually stop the whole program instead of just hiding our frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Default: JFrame.HIDE_ON_CLOSE Other: DO_NOTHING_ON_CLOSE
        this.setResizable(false);  // Prevent from resizing frame
        this.setSize(420, 420);    // Sets x dimension and y dimension of frame

        ImageIcon image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\Adidas_Logo.svg.png"); // This will create an image icon
        this.setIconImage(image.getImage());   // Change icon of frame

        this.getContentPane().setBackground(Color.BLACK);
        this.getContentPane().setBackground(new Color(32,10,87));
        this.getContentPane().setBackground(new Color(0xFF2842));

        this.setVisible(true);     // Make frame visible when we run the code
    }
}

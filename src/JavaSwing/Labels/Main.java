package JavaSwing.Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("jinx3.jpg");

        Border border = BorderFactory.createLineBorder(Color.PINK, 3);

//        JLabel myLabel = new JLabel();
//        myLabel.setText("Hey DUDE"); // set text of label
        JLabel label = new JLabel("Dude, do you code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Jlabel.LEFT , Jlabel.RIGHT
        label.setVerticalTextPosition(JLabel.TOP);  // JLabel.CENTER, JLabel.BOTTOM
        label.setForeground(Color.WHITE);   // Set color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 40));
        label.setIconTextGap(40);   // Set a gap between text and image
        label.setBackground(Color.BLACK); // Set background color
        label.setOpaque(true);  // Display background color of label
        label.setBorder(border);
//        Sets whole position of icon + text within label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//      This makes it so that our label doesn't take whole screen
//        label.setBounds(0, 0, 600, 600);
//      Can also set the x y cord
//        label.setBounds(100, 100, 600, 600);

        MyFrame frame = new MyFrame();
        frame.add(label);
//        frame.setLayout(null);
        frame.pack();


    }
}

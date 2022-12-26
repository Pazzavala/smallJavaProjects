package JavaSwing.LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class BorderLayouts {
//        Layout Manager - Defines the natual layout for the components within a container

//        3 Common Managers

//        BorderLayout - A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
//                          - All extra space is placed in the center area.

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
//        The arguments 10, 10 are margin to panels
        frame.setLayout(new BorderLayout(10, 10)); // this is already default but we still adding it for ex

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));


//        SUB panels
        panel5.setLayout(new BorderLayout());

        JPanel subPanel1 = new JPanel();
        JPanel subPanel2 = new JPanel();
        JPanel subPanel3 = new JPanel();
        JPanel subPanel4 = new JPanel();
        JPanel subPanel5 = new JPanel();

        subPanel1.setBackground(Color.BLACK);
        subPanel2.setBackground(Color.DARK_GRAY);
        subPanel3.setBackground(Color.GRAY);
        subPanel4.setBackground(Color.LIGHT_GRAY);
        subPanel5.setBackground(Color.WHITE);

        subPanel1.setPreferredSize(new Dimension(50, 50));
        subPanel2.setPreferredSize(new Dimension(50, 50));
        subPanel3.setPreferredSize(new Dimension(50, 50));
        subPanel4.setPreferredSize(new Dimension(50, 50));
        subPanel5.setPreferredSize(new Dimension(50, 50));

        panel5.add(subPanel1, BorderLayout.NORTH);
        panel5.add(subPanel2, BorderLayout.EAST);
        panel5.add(subPanel3, BorderLayout.SOUTH);
        panel5.add(subPanel4, BorderLayout.WEST);
        panel5.add(subPanel5, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);

    }
}

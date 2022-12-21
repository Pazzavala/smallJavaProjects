package JavaSwing.LayeredPanes;

import javax.swing.*;
import java.awt.*;

public class Layered {
    public static void main(String[] args) {
//        JLayeredPane - Swing container that provides a third
//        dimension for positioning components.
//                ex: depth, Z-index
        JLabel label1 = new JLabel("Modal");
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel("Palette");
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel("Default");
        label3.setOpaque(true);
        label3.setBackground(Color.YELLOW);
        label3.setBounds(150, 150, 200, 200);
        label3.setForeground(Color.WHITE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label1, Integer.valueOf(0)); // layer DEFAULT_LAYER
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, Integer.valueOf(1)); // DRAG_LAYER

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.add(layeredPane);

        frame.setVisible(true);

    }
}

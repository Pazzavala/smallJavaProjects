package JavaSwing.Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label1 = new JLabel("Hello");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\red.png");
        label1.setIcon(icon1);
        label1.setForeground(Color.WHITE);
        label1.setBounds(100, 100, 200, 200);

        JLabel label2 = new JLabel("BYE");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\finger.png");
        label2.setIcon(icon2);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setForeground(Color.WHITE);

        JLabel label3 = new JLabel("OOPS");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\insta.png");
        label3.setIcon(icon3);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setForeground(Color.WHITE);

//        JPanel - A GUI component that functions as a container to hold other components

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0, 0, 400, 400);
        blackPanel.add(label1);
        blackPanel.setLayout(null);


        JPanel purplePanel = new JPanel();
        purplePanel.setBackground(Color.MAGENTA);
        purplePanel.setBounds(400, 0, 400, 400);
        purplePanel.setLayout(new BorderLayout());
        purplePanel.add(label2);

        JPanel grayPanel = new JPanel();
        grayPanel.setBackground(Color.GRAY);
        grayPanel.setBounds(0, 400, 800, 300);
        grayPanel.setLayout(new BorderLayout());
        grayPanel.add(label3);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(850, 750);
        frame.setVisible(true);
        frame.add(blackPanel);
        frame.add(purplePanel);
        frame.add(grayPanel);
    }
}

package JavaSwing.KeyListening;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon image;
    MyFrame() {
        label = new JLabel();
        image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\car.png");

        label.setBounds(0, 0, 100, 100);
        label.setIcon(image);

        this.add(label);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        keyTyped - Invoked when a key is typed. uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10) ;
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        keyPressed - Invoke when a physical key is pressed down. uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 5, label.getY());
            case 39 -> label.setLocation(label.getX() + 5, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - 5) ;
            case 40 -> label.setLocation(label.getX(), label.getY() + 5);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        keyReleased - called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar() + " with key code : " + e.getKeyCode());
    }
}

package JavaSwing.MouseListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon image;
    MyFrame() {
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.addMouseListener(this);

        image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\Mexico.png");
        label.setIcon(image);

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        Invoked when a mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setIcon(image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\rainbow.png"));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        Invoked when a mouse button has been released on a component
        System.out.println("You Released the mouse");
        label.setIcon(image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\US.png"));

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        Invoked when a mouse enters a component
        System.out.println("You entered the Component");
        label.setIcon(image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\Mexico.png"));
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        Invoked when a mouse exits a component
        System.out.println("You Exited the Component");
        label.setIcon(image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\argentina.png"));
    }
}

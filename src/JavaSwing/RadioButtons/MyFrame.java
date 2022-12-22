package JavaSwing.RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizza;
    ImageIcon burger;
    ImageIcon hotdog;
    MyFrame() {
        pizzaButton = new JRadioButton("pizza");
        burgerButton = new JRadioButton("Burger");
        hotdogButton = new JRadioButton("hotdog");

        pizza = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\pizza.png");
        burger = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\hamburger.png");
        hotdog = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\hotdog.png");

        pizzaButton.setIcon(pizza);
        burgerButton.setIcon(burger);
        hotdogButton.setIcon(hotdog);

        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        ButtonGroup group =  new ButtonGroup();

        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton)
            System.out.println("You get pizza");
        else if (e.getSource() == burgerButton)
            System.out.println("You get Burgers");
        else
            System.out.println("You get Hotdogs");
    }
}

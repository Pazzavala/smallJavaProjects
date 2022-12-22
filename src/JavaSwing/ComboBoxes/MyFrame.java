package JavaSwing.ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox<String> comboBox;
    MyFrame() {
        String[] animals = {"Cat", "Dog", "Bird"};

        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);
//        Allows to type our answer
        comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("Horse");
        comboBox.insertItemAt("Pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("Horse");

        this.add(comboBox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            Object item = comboBox.getSelectedItem();
            int i = comboBox.getSelectedIndex();
            System.out.println("You have a " + item + " " + i);
        }
    }
}

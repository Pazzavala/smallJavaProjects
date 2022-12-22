package JavaSwing.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon checkMark;
    ImageIcon xMark;
    MyFrame() {
        button = new JButton("Submit");
        button.addActionListener(this);

        checkMark = new ImageIcon("check.png");
        xMark = new ImageIcon("x.png");

        checkBox = new JCheckBox("Worked-out");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 24));
        checkBox.setIcon(xMark);
        checkBox.setSelectedIcon(checkMark);

        this.add(button);
        this.add(checkBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            boolean check =  checkBox.isSelected();
            System.out.println(check);
        }
    }
}

package JavaSwing.Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// One way to Implement this
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {

        ImageIcon icon = new ImageIcon("bmo.png");
        ImageIcon icon2 = new ImageIcon("icons8-black-cat-96.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Click Here");
        button.setFocusable(false); //gets rid of box around text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Hey");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
// Way to do action listener with lambda expression
//public class MyFrame extends JFrame {
//    JButton button;
//    MyFrame() {
//
//        ImageIcon icon = new ImageIcon("bmo.png");
//        int count = 0;
//
//        button = new JButton();
//        button.setBounds(100, 100, 250, 100);
//        button.addActionListener(e -> System.out.println("Hey") );
//        button.setText("Click Here");
//        button.setFocusable(false); //gets rid of box around text
//        button.setIcon(icon);
//        button.setHorizontalTextPosition(JButton.CENTER);
//        button.setVerticalTextPosition(JButton.BOTTOM);
//        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
//        button.setIconTextGap(-5);
//        button.setForeground(Color.WHITE);
//        button.setBackground(Color.GRAY);
//        button.setBorder(BorderFactory.createEtchedBorder());
//
//        button.setEnabled(false);
//
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setLayout(null);
//        this.setSize(500, 500);
//        this.setVisible(true);
//        this.add(button);
//    }
//}

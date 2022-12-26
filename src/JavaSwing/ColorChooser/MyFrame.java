package JavaSwing.ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {
        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel("This is some text");
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(new Font("Mv Boli", Font.PLAIN, 100));

        this.add(button);
        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Picka a color", Color.BLACK);
            Color color1 = JColorChooser.showDialog(null, "pick backgroun", Color.WHITE);

            label.setForeground(color);
            label.setBackground(color1);
        }
    }
}

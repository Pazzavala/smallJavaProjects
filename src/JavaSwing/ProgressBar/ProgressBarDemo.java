package JavaSwing.ProgressBar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProgressBarDemo implements ActionListener {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    JButton attack = new JButton("Attack");
    JButton heal = new JButton("Heal");

    ProgressBarDemo() {

        attack.setBounds(0, 50, 210, 50);
        heal.setBounds(210, 50, 210, 50);
        attack.addActionListener(this);
        heal.addActionListener(this);

        bar.setValue(100);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Mv Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.add(attack);
        frame.add(heal);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void fill(int val) {
        bar.setValue(bar.getValue() + val);
        if (val < 0)
            bar.setString("Attacked");
        else
            bar.setString("Healed");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == attack)
            fill(-10);
        else if (e.getSource() == heal)
            fill(10);
    }
}

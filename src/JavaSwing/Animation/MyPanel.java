package JavaSwing.Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    Image enemy;
    Image backgroundImage= new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\background1.jpg").getImage();
    final int PANEL_WIDTH = backgroundImage.getWidth(null);
    final int PANEL_HEIGHT = backgroundImage.getHeight(null);

    Timer timer;
    int xVelocity = 2;
    int yVelocity = 2;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        enemy = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\red.png").getImage();
        timer = new Timer(10, this);

        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);  // paint the background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0,0, null);
        g2D.drawImage(enemy, x, y , null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0 ) {
            xVelocity *= -1;
        }
        x += xVelocity;

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0 ) {
            yVelocity *= -1;
        }
        y += yVelocity;

        repaint();
    }
}

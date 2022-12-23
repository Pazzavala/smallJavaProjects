package JavaSwing.Graphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Images\\dribble.png").getImage();
    MyPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 500, 0, null);

        int[] xPoints = {0, 400, 150};
        int[] yPoints =  {0, 150, 400};
        g2D.setPaint(Color.BLACK);

        g2D.fillPolygon(xPoints,yPoints,3);

        g2D.setStroke(new BasicStroke(10));
        g2D.setPaint(Color.GREEN);
        g2D.drawLine(0, 0, 500, 500);

        g2D.setPaint(Color.PINK);
        g2D.drawRect(100, 100, 100, 100);
        g2D.fillRect(200, 200, 100, 100);
        g2D.drawRect(300, 300, 100, 100);

        g2D.setPaint(Color.GRAY);
        g2D.drawOval(200, 200, 100, 100);
        g2D.fillOval(100, 100, 100, 100);
        g2D.fillOval(300, 300, 100, 100);

        g2D.setPaint(Color.RED);
        g2D.fillArc(0, 0, 100, 100, 0, 180);
        g2D.setPaint(Color.WHITE);
        g2D.fillArc(0, 0, 100, 100, 180, 180);

        g2D.setPaint(Color.MAGENTA);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 15));
        g2D.drawString("YOOOOO", 10, 60);

    }
}

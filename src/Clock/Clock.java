package Clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {

    String time, day, date;

    JLabel timeLabel = new JLabel();
    JLabel dayLabel = new JLabel();
    JLabel dateLabel = new JLabel();

    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    SimpleDateFormat dayFormat = new SimpleDateFormat(" EEEE ");
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d y");

    Clock() {
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(340, 200));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
        dayLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);

        this.setVisible(true);

        setTime();
    }

    private void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            day = dayFormat.format(Calendar.getInstance().getTime());
            date = dateFormat.format(Calendar.getInstance().getTime());

            timeLabel.setText(time);
            dayLabel.setText(day);
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

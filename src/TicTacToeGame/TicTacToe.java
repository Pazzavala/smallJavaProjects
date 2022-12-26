package TicTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    boolean xTurn;
    JPanel titlePanel;
    JPanel gamePanel;
    JButton[] buttons;
    JLabel title;
    Random rand = new Random();

    TicTacToe() {
        titlePanel = new JPanel();
        gamePanel = new JPanel();
        buttons = new JButton[9];
        title = new JLabel("TicTacToe");
        xTurn = firstTurn();

        title.setFont(new Font("Ink Free", Font.BOLD,  75));
        title.setForeground(Color.WHITE);

        titlePanel.setPreferredSize(new Dimension(500, 100));
        titlePanel.setBackground(Color.DARK_GRAY);
        titlePanel.add(title);

        gamePanel.setLayout(new GridLayout(3, 3));
        gamePanel.setPreferredSize(new Dimension(500, 500));
        gamePanel.setBackground(Color.BLACK);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            gamePanel.add(buttons[i]);
        }

        this.setSize(new Dimension(500,500));
        this.setLayout(new BorderLayout());
        this.add(titlePanel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setVisible(true);
    }

//    TODO: Check who's turn it is and depending of who's it is
//     make the click of button turn either into an x or an o
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                buttons[i].setFont(new Font("Mv Boli", Font.BOLD, 60));

                if (xTurn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("X");
                        xTurn = false;
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("O");
                        xTurn = true;
                    }
                }
            }
        }
    }

//    TODO: Set who's turn it is to play with a random variable
    public boolean firstTurn() {

        int player = rand.nextInt(2);

        if (player == 0) {
           return true;
        } else {
            return false;
        }
    }

//    TODO: Check winning combinations for all possible combos for x and o
    public void checkWins() {

//        Horizontal
        if (buttons[0].getText() == "X" && buttons[1].getText()  == "X" && buttons[2].getText()  == "X") {
            xWin(0, 1, 2);
        } else if (buttons[3].getText() == "X" && buttons[4].getText()  == "X" && buttons[5].getText()  == "X") {
            xWin(3, 4, 5);
        } else if (buttons[6].getText() == "X" && buttons[7].getText()  == "X" && buttons[8].getText()  == "X") {
            xWin(6, 7, 8);
        }

        if (buttons[0].getText() == "O" && buttons[1].getText()  == "O" && buttons[2].getText()  == "O") {
            xWin(0, 1, 2);
        } else if (buttons[3].getText() == "O" && buttons[4].getText()  == "O" && buttons[5].getText()  == "O") {
            xWin(3, 4, 5);
        } else if (buttons[6].getText() == "O" && buttons[7].getText()  == "O" && buttons[8].getText()  == "O") {
            xWin(6, 7, 8);
        }

//        Vertical
        if (buttons[0].getText() == "X" && buttons[3].getText()  == "X" && buttons[6].getText()  == "X") {
            xWin(0, 3, 6);
        } else if (buttons[1].getText() == "X" && buttons[4].getText()  == "X" && buttons[7].getText()  == "X") {
            xWin(1, 4, 7);
        } else if (buttons[2].getText() == "X" && buttons[5].getText()  == "X" && buttons[8].getText()  == "X") {
            xWin(2, 5, 8);
        }

        if (buttons[0].getText() == "O" && buttons[3].getText()  == "O" && buttons[6].getText()  == "O") {
            xWin(0, 3, 6);
        } else if (buttons[1].getText() == "O" && buttons[4].getText()  == "O" && buttons[7].getText()  == "O") {
            xWin(1, 4, 7);
        } else if (buttons[2].getText() == "O" && buttons[5].getText()  == "O" && buttons[8].getText()  == "O") {
            xWin(2, 5, 8);
        }

//        Diagonals
        if (buttons[0].getText() == "X" && buttons[4].getText()  == "X" && buttons[8].getText()  == "X") {
            xWin(0, 4, 8);
        } else if (buttons[2].getText() == "X" && buttons[4].getText()  == "X" && buttons[6].getText()  == "X") {
            xWin(2, 4, 6);
        }

        if (buttons[0].getText() == "O" && buttons[4].getText()  == "O" && buttons[8].getText()  == "O") {
            xWin(0, 4, 8);
        } else if (buttons[2].getText() == "O" && buttons[4].getText()  == "O" && buttons[6].getText()  == "O") {
            xWin(2, 4, 6);
        }

    }

    // TODO: implement method to change winning combination buttons
    //  to green and get the title to say x wins disable buttons
    public void xWin(int a, int b, int c) {

    }

    // TODO: implement method to change winning combination buttons
    //  to green and get the title to say o wins disable buttons
    public void oWin(int a, int b, int c) {

    }
}

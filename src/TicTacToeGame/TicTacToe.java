package TicTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    boolean xTurn;
    boolean keepPlaying = false;
    JButton replay = new JButton("Replay");
    JButton quit = new JButton("Quit");
    JPanel gameButtonsPanel = new JPanel();
    JPanel titlePanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel scorePanel = new JPanel();
    JButton[] buttons = new JButton[9];
    JLabel title = new JLabel("Tic-Tac-Toe");
    int xPoints = 0;
    int oPoints = 0;
    JLabel xScore = new JLabel("X: " + xPoints);
    JLabel oScore = new JLabel("O: " + oPoints);

    Random rand = new Random();

    TicTacToe() {

        title.setFont(new Font("Tahoma", Font.BOLD,  75));
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

        replay.addActionListener(this);
        replay.setSize(new Dimension(6, 3));
        replay.setFont(new Font("Ink Free", Font.BOLD,  20));

        quit.addActionListener(this);
        quit.setSize(new Dimension(6, 3));
        quit.setFont(new Font("Ink Free", Font.BOLD,  20));

        gameButtonsPanel.setLayout(new GridLayout());

        gameButtonsPanel.add(replay);
        gameButtonsPanel.add(quit);

        xScore.setFont(new Font("Tahoma", Font.BOLD,  50));
        xScore.setForeground(Color.RED);
        oScore.setFont(new Font("Tahoma", Font.BOLD,  50));
        oScore.setForeground(Color.BLUE);

        scorePanel.setLayout(new BorderLayout());

        scorePanel.add(xScore, BorderLayout.EAST);
        scorePanel.add(gameButtonsPanel, BorderLayout.CENTER);
        scorePanel.add(oScore, BorderLayout.WEST);

        this.setSize(new Dimension(600,600));
        this.setLayout(new BorderLayout());

        this.add(titlePanel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);
        this.add(scorePanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic-Tac-Toe");
        this.setVisible(true);

        xTurn = firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        if players press replay reset the board else exit when quit
        if (e.getSource() == replay) {
            keepPlaying = true;
            for (int i = 0; i < 9; i++) {
                buttons[i].setText("");
                buttons[i].setEnabled(true);

                if (xTurn)
                    title.setText("X Turn");
                else
                    title.setText("O Turn");


            }
        } else if (e.getSource() == quit) {
            System.exit(0);
        }

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                buttons[i].setFont(new Font("Tahoma", Font.BOLD, 90));

                if (xTurn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setText("X");
                        xTurn = false;
                        title.setText("O Turn");
                        checkWins();
                    }
                } else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setText("O");
                        xTurn = true;
                        title.setText("X Turn");
                        checkWins();
                    }
                }
            }
        }
    }

//    Set who starts first random
    public boolean firstTurn() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(rand.nextInt(2) == 0) {
            title.setText("X Turn");
            return true;
        } else {
            title.setText("O Turn");
            return false;
        }
    }

//    Check winning combos
    public void checkWins() {
//        Horizontal
        if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X")  && buttons[2].getText().equals("X")) {
            xWin(0, 1, 2);
        } else if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
            xWin(3, 4, 5);
        } else if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWin(6, 7, 8);
        }

        if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")) {
            oWin(0, 1, 2);
        } else if (buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")) {
            oWin(3, 4, 5);
        } else if (buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWin(6, 7, 8);
        }

//        Vertical
        if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWin(0, 3, 6);
        } else if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
            xWin(1, 4, 7);
        } else if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWin(2, 5, 8);
        }

        if (buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")) {
            oWin(0, 3, 6);
        } else if (buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")) {
            oWin(1, 4, 7);
        } else if (buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWin(2, 5, 8);
        }

//        Diagonals
        if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWin(0, 4, 8);
        } else if (buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWin(2, 4, 6);
        }

        if (buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")) {
            oWin(0, 4, 8);
        } else if (buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O")) {
            oWin(2, 4, 6);
        }
    }

//    Display when X wins
    public void xWin(int a, int b, int c) {

        for (int i = 0; i < 9; i++) {
            if (i == a || i == b || i == c) {
                buttons[i].setEnabled(true);
            } else {
                buttons[i].setEnabled(false);
            }
        }

        buttons[a].setForeground(Color.GREEN);
        buttons[b].setForeground(Color.GREEN);
        buttons[c].setForeground(Color.GREEN);
        title.setText("X wins!");
        xScore.setText("X: " + (++xPoints));

        keepPlaying = false;
    }

//    Display when X wins
    public void oWin(int a, int b, int c) {
        for (int i = 0; i < 9; i++) {
            if (i == a || i == b || i == c) {
                buttons[i].setEnabled(true);
            } else {
                buttons[i].setEnabled(false);
            }
        }

        buttons[a].setForeground(Color.GREEN);
        buttons[b].setForeground(Color.GREEN);
        buttons[c].setForeground(Color.GREEN);
        title.setText("O wins!");
        oScore.setText("O: " + (++oPoints));

        keepPlaying = false;
    }
}


package TicTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    boolean xTurn;
    boolean keepPlaying = true;
    JButton replay = new JButton("Replay");
    JButton quit = new JButton("Quit");
    JPanel gameButtonsPanel = new JPanel();
    JPanel titlePanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel scorePanel = new JPanel();
    JButton[] buttons = new JButton[9];
    JLabel title = new JLabel("TicTacToe");
    int xPoints = 0;
    int oPoints = 0;
    JLabel xScore = new JLabel("X: " + xPoints);
    JLabel oScore = new JLabel("O: " + oPoints);

    Random rand = new Random();

    TicTacToe() {
        drawBoard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == replay)

            drawBoard();
        else if (e.getSource() == quit)
            System.exit(0);

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                buttons[i].setFont(new Font("Mv Boli", Font.BOLD, 60));

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

    public void drawBoard() {
        xTurn = firstTurn();

        gameButtonsPanel.setLayout(new GridLayout());

        replay.setSize(new Dimension(6, 3));
        quit.setSize(new Dimension(6, 3));

        replay.setFont(new Font("Ink Free", Font.BOLD,  20));
        quit.setFont(new Font("Ink Free", Font.BOLD,  20));

        replay.addActionListener(this);
        quit.addActionListener(this);

        gameButtonsPanel.add(replay);
        gameButtonsPanel.add(quit);

        title.setFont(new Font("Ink Free", Font.BOLD,  75));
        title.setForeground(Color.WHITE);

        titlePanel.setPreferredSize(new Dimension(500, 100));
        titlePanel.setBackground(Color.DARK_GRAY);
        titlePanel.add(title);

        gamePanel.setLayout(new GridLayout(3, 3));
        gamePanel.setPreferredSize(new Dimension(500, 500));
        gamePanel.setBackground(Color.BLACK);

        scorePanel.setLayout(new BorderLayout());

        oScore.setFont(new Font("Ink Free", Font.BOLD,  50));
        scorePanel.add(xScore, BorderLayout.EAST);

        scorePanel.add(gameButtonsPanel, BorderLayout.CENTER);

        xScore.setFont(new Font("Ink Free", Font.BOLD,  50));
        scorePanel.add(oScore, BorderLayout.WEST);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            gamePanel.add(buttons[i]);
        }

        this.setSize(new Dimension(600,600));
        this.setLayout(new BorderLayout());

        this.add(titlePanel, BorderLayout.NORTH);
        this.add(gamePanel, BorderLayout.CENTER);
        this.add(scorePanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TicTacToe");
        this.setVisible(true);
    }

    public boolean firstTurn() {
        if(rand.nextInt(2) == 0) {
            title.setText("X Turn");
            return true;
        } else {
            title.setText("O Turn");
            return false;
        }
    }

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

    public void xWin(int a, int b, int c) {
        buttons[a].setForeground(Color.GREEN);
        buttons[b].setForeground(Color.GREEN);
        buttons[c].setForeground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            if (i == a || i == b || i == c) {
                buttons[i].setEnabled(true);
            } else {
                buttons[i].setEnabled(false);
            }
        }
        title.setText("X wins!");
        xScore.setText("X: " + (++xPoints));

    }

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
    }
}


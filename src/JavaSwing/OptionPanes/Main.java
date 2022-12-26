package JavaSwing.OptionPanes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane - pop up a standard dialog box that prompts
//        users for a value or informs them of something.
        JOptionPane.showMessageDialog(null, "Hey there IDK", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hey there again IDK", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hey there IDK?", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your PC have a VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Call Tech Support NOWW!!!", "title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Do you Code?", "Titile1", JOptionPane.YES_NO_CANCEL_OPTION);
//        yes - 0     no - 1    cancel -2
        if (answer == 0)
            JOptionPane.showMessageDialog(null, "You are a programmer", "msg1", JOptionPane.PLAIN_MESSAGE);
        else if (answer == 1)
            JOptionPane.showMessageDialog(null, "You are not a programmer", "msg1", JOptionPane.PLAIN_MESSAGE);

        String name = JOptionPane.showInputDialog("What is your Name? ");
        System.out.println(name);

        String[] responses = {"No, You are cool", "Thank You!", "*BLUSH*"};

        ImageIcon icon = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\icons8-black-cat-48.png");

        JOptionPane.showOptionDialog(null, "You are cool", "Secrete", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}

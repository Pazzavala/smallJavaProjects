package Basic;

import javax.swing.JOptionPane;

public class BasicGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
        
        JOptionPane.showMessageDialog(null, "You are " + age + " Years Old");

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your heigh"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm Tall");
    }
}

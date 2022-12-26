package JavaSwing.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon load = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\folder.png");
    ImageIcon save = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\save.png");
    ImageIcon exit = new ImageIcon("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Images\\exit.png");
    MyFrame() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(load);
        saveItem.setIcon(save);
        exitItem.setIcon(exit);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Paste"));

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + L for file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + H for help

        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for Exit

        this.setJMenuBar(menuBar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem)
            System.out.println("Loading...");
        else if (e.getSource() == saveItem)
            System.out.println("Saving...");
        else
            System.exit(0);
    }
}

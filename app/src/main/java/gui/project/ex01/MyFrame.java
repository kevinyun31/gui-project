package app.src.main.java.gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    public MyFrame() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // MyFrame f = new MyFrame();
        new MyFrame();
    }

}

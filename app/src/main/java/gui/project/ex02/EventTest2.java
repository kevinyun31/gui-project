package gui.project.ex02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        // couner++;
        // label.setText("현재의 카운터값: "+counter);
    }
}

public class EventTest2 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public EventTest2() {
        setSize(400, 150);
        setTitle("이벤트 예제");
        setLayout(new FlowLayout());
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값: " + counter);
        button.addActionListener(new MyListener());
        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventTest2 t = new EventTest2();

    }
}

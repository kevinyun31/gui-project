package gui.project.ex02;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*; //event 패키지에 이벤트를 처리하는 클래스들이 모여있다.

public class EventTest1 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("현재의 카운터값 : " + counter);
        }
    }

    public EventTest1() {
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
        EventTest1 t = new EventTest1();

    }
}

import javax.swing.*;
import java.awt.event.*;



public class SimpleGui1B implements ActionListener {
    JButton button;
    MyDrawPanelOld myDrawPanel;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
//        gui.go();
        gui.goMyPanel();
    }


    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
    public void goMyPanel() {
        JFrame frame = new JFrame();
        myDrawPanel = new MyDrawPanelOld();
        frame.getContentPane().add(myDrawPanel);
        frame.setSize(300, 300);
//        myDrawPanel.paintComponent();
        frame.setVisible(true);
    }
}


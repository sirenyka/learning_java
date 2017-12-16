import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyGUI implements ActionListener {
    JFrame frame;
    JLabel label;

    public void start() {
        frame = new JFrame();
        MyImage myImage = new MyImage();
        JButton colorbutton = new JButton();
        JButton labelbutton = new JButton();
        label = new JLabel("I'm LABEL!");
        colorbutton.setText("CLICK FOR CHAHGE COLOR!");
        labelbutton.setText("CLICK FOR CHANGE LABEL");
        colorbutton.addActionListener(new ColorListener());
        labelbutton.addActionListener(new LabelListener());


        frame.getContentPane().add(BorderLayout.CENTER, myImage);
        frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
        frame.getContentPane().add(BorderLayout.EAST, labelbutton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(100, 100);
    }

    public static void main(String[] args) {
        MyGUI myGui = new MyGUI();
        myGui.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();

    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("hohoho");
        }
    }
}

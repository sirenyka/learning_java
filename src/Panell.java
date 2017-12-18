import javax.swing.*;
import java.awt.*;

public class Panell {
    public static void main(String[] args) {
        Panell panell = new Panell();
        panell.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
//
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton one = new JButton("shock me");
        JButton two = new JButton("bliss");
        JButton three = new JButton("huh?");
        frame.getContentPane().add(BorderLayout.EAST, panel);
//        frame.setContentPane(panel);
        panel.add(one);
        panel.add(two);
        panel.add(three);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}

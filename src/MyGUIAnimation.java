import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIAnimation {
    JFrame frame;
    MyDrawPanelForAnimation myDrawPanel;

    public static void main(String[] args) {
        MyGUIAnimation myGUIAnimation = new MyGUIAnimation();
        myGUIAnimation.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setSize(500, 500);
        myDrawPanel = new MyDrawPanelForAnimation();
        frame.getContentPane().add(myDrawPanel);
        JButton moveButton = new JButton("MOVE!");
        frame.getContentPane().add(BorderLayout.SOUTH, moveButton);
        moveButton.addActionListener(myDrawPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class MyDrawPanelForAnimation extends JPanel implements ActionListener {
        int x = 5;
        int y = 5;

        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.MAGENTA);
            g.fillOval(x, y, 40, 40);
        }

        public void move() {
            for (int i = 0; i < 100; i++) {
                x++;
                y++;
                frame.repaint();
                try {
                    Thread.sleep(20);
                } catch (Exception ex) { }
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new Thread() {
                @Override
                public void run() {
                    myDrawPanel.move();
                }
            }.start();
        }
    }
}
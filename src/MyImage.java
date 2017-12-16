import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyImage extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 80, 80);
    }
}

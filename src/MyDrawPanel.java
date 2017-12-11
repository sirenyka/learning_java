import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
//        g.setColor(Color.green);
//        g.fillRect(20, 50, 100, 100);
//
//        Image image = new ImageIcon(("/home/alex/%D0%97%D0%B0%D0%B3%D1%80%D1%83%D0%B7%D0%BA%D0%B8/photo_2017-12-03_23-13-17.jpg")).getImage();
//        g.drawImage(image, 3,4, this);
//
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillRect(10, 10, 100, 100);
    }
}

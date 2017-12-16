import java.awt.*;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;

class MyDrawPanelOld extends JPanel implements ControllerEventListener {
    boolean msg = false;
    @Override
    public void paintComponent(Graphics g) {
        if (msg) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);

            int h = ((int) (Math.random() * ((getHeight() / 2))));
            int w = ((int) (Math.random() * ((getWidth() / 2))));

            int x = ((int) (Math.random() * ((getHeight() / 2))));
            int y = ((int) (Math.random() * ((getHeight() / 2))));

            g.fillRect(x, y, w, h);
            msg = false;
        }
    }

    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }
}

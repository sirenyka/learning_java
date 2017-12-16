import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {
    private JFrame f = new JFrame("мой первый клип");
    private MyDrawPanel mdp;

    public static void main(String[] args) {
        MiniMusicPlayer3 mp3 = new MiniMusicPlayer3();
        mp3.go();
    }

    public void go() {
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(mdp, new int[]{127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 50; i < 100; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
        }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

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

                int y = ((int) (Math.random() * ((getHeight() / 2))));
                int x = ((int) (Math.random() * ((getWidth() / 2))));

                g.fillRect(x, y, w, h);
                msg = false;
            }
        }
    }

    public void setUpGui() {
        mdp = new MyDrawPanel();
        f.getContentPane().add(mdp);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
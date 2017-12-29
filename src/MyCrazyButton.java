import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCrazyButton {

    private String message;

    private class GUI {
        JTextArea textArea;

        public void setUpGUI() {
            //подготавливаем GUI

            //главное окно с панелью
            JFrame frame = new JFrame("окно с кнопкой");
            JPanel panel = new JPanel();
//            panel.setSize(100, 100);

            //кнопка
            JButton button = new JButton("кнопка быстрого реагирования");
            button.addActionListener(new ButtonListener());
            frame.add(BorderLayout.NORTH, button);

            //текстовое окно
            textArea = new JTextArea(20, 10);
            textArea.setSize(20, 20);
//            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            textArea.getScrollableTracksViewportWidth();

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            frame.getContentPane().add(scrollPane);
//            frame.add(BorderLayout.SOUTH, textArea);

//            frame.setContentPane(panel);
            frame.getContentPane().add(BorderLayout.NORTH, button);
//            frame.getContentPane().add(textArea);
            frame.setSize(500, 100);
            frame.setVisible(true);
//            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        private class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                //создаем массив ответов(стрингов)
                //выбираем рандомно вариант
                //отправляем в панель(textArea)

                String[] answerList = {"Я не знаю, что вы едите за завтраком, но это реально действует! Интеллект стремится к нулю!",
                        "Только не надо вынимать наушники из ушей",
                        "Перед нашей беседой я думал, что вы интеллигент, или просто очень начитанный человек. И как видите я зря боялся попасть пальцем в небо.",
                        "Чтобы меня шокировать, вам прийдется сказать что-нибудь умное.",
                        "Глядя на вас начинаю понимать, что ничто человечeское Богу не чуждо. У него отличное чувство юмора.",
                        "Ведь можем мы, когда не надо!",
                        "Wi-Fi лишним не бывает.",
                        "Незваный гость хуже спама.",
                        "Ворчание — знак согласия!",
                        "Рано встал — всех достал."};
                int random = (int) (Math.random() * answerList.length);
                message = answerList[random];
                textArea.setText(message);
           }
        }
    }

    public static void main(String[] args) {
        //запускаем работу программы
        MyCrazyButton myCrazyButton = new MyCrazyButton();
        myCrazyButton.go();
    }


    public void go() {
        //основное действие программы
        GUI gui = new GUI();
        gui.setUpGUI();
    }
}

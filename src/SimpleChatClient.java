import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextField outgoing;
    JTextArea incoming;
    PrintWriter writer;
    BufferedReader reader;
    Socket sock;

    public void go() {
        //создаем GUI и подключаем слушателя для событий к кнопке отправки
        //вызываем метод setUpNetworking()
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15, 20);
        incoming.setLineWrap(true);
        incoming.setEditable(false);
        mainPanel.add(incoming);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

    }

    private void setUpNetworking() {
        //создаем сокет и PrintWriter
        //присваиваем PrintWriter переменной writer
        try {
            sock = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //получаем текст из текстового поля и отправляем
            //его на сервер с помощью writer(PrintWriter)
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SimpleChatClient().go();
    }
}

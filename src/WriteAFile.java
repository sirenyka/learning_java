import java.io.FileWriter;
import java.io.IOException;

class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Привет, фу!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

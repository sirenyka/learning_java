//import jdk.internal.jline.internal.InputStreamReader;

import java.io.*;
import java.util.ArrayList;

public class GameHelper {
    public String getUserInput(String promt) {
        String inputLine = null;
        System.out.println(promt + " ");
        try {
            BufferedReader is = new BufferedReader(new
                    InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDotCom(int i) {
        return null;
    }
}

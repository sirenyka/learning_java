//import java.io.InputStreamReader;
import java.util.*;

/**
 * игровое поле
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String name) {
        this.name = name;
    }
}

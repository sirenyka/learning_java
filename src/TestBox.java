import java.util.Calendar;
import java.util.Date;

public class TestBox {
    Integer i;
    int j;
    String s = "ad fjlklk ghghgj jj";

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        i = j;
        System.out.println(j);
        System.out.println(i);

        String[] sSplit = s.split(" ");
        for (String part:sSplit) {
            System.out.println(part);
        }
//        System.out.println(String.format("%.2f",42.14255557575757575));
        System.out.println(String.format("%tA, %tB", new Date(), new Date()));

        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}

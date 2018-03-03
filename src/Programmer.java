abstract class Writer {
    public static void write() {
        System.out.println("Writing");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}

public class Programmer {
    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Programmer w = new Programmer();
        w.write();
    }
}

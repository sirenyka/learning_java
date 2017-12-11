class StaticSuper {
    static {
        System.out.println("родительский статический блок");
    }
    StaticSuper() {
        System.out.println("родительский конструктор");
    }
}

public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int)(Math.random()*6);
        System.out.println("статический блок " + rand);
    }

    StaticTests() {
        System.out.println("конструктор");
    }

    public static void main(String[] args) {
        System.out.println("внутри main");
        StaticTests st = new StaticTests();
    }
}

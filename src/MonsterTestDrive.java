public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}
class Monster {
    boolean frighten(int d) {
        System.out.println("Гррр");
        return false;
    }
}
class Vampire extends Monster {
    boolean frighten(byte d) {
        System.out.println("Укусить?");
        return true;
    }
}
class Dragon extends Monster {
    @Override
    boolean frighten(int d) {
        System.out.println("Огненное дыхание");
        return true;
    }
}
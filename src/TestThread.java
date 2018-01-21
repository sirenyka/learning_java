public class TestThread {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        Thread one = new Thread(t1);
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }

}

class Accum {
    private int counter = 0;
    private static Accum a = new Accum();
    private Accum() {
    }

    public static Accum getAccum() {
        return a;
    }

    public int getCount() {
        return counter;

    }

    public synchronized void updateCounter(int add) {
        counter += add;
    }

}

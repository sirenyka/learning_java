class ThreadOne implements Runnable {
    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int x = 0; x < 98; x++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { }
        }
        System.out.println("один " + a.getCount());
    }
}

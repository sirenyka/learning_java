public class RyanAndMonikaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonikaJob job = new RyanAndMonikaJob();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithDraw(10);
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита");
            }
        }
    }

    private synchronized void makeWithDraw(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " cобирается снять " + amount);
            try {
                System.out.println(Thread.currentThread().getName() + " идет спать");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
        } else {
            System.out.println("Извините, для клиента " + Thread.currentThread().getName() + " недостаточно денег");
        }
    }
}

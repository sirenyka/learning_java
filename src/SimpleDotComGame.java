public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        DotCom dot = new DotCom();
        int randomNum = (int)(Math.random() * 5);
        int[] location = {randomNum, randomNum + 1, randomNum + 2};

//        int[] locArr = new int[3];
//        Random newRandom = new Random();

//        int i = newRandom.nextInt(4);
//        locArr[0] = i;
//        locArr[1] = i + 1;
//        locArr[2] = i + 2;

//        dot.setLocationCells(location);

        boolean isAlive = true;

        while (isAlive) {
            String userInput = helper.getUserInput("Введите число");
            // проверим ввод пользователя;
            String result = dot.checkYourself(userInput);
            numOfGuess++;
//            boolean resultOfHit = dot.checkAlive();
            if ("Потопил".equals(result)) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuess + " попыток");
            }
        }
//        Scanner in = new Scanner(System.in);
//        String user = in.next();
//        InputStreamReader user = new InputStreamReader(System.in);
//        while (dot.numOfHits < 3) {
//            dot.checkYourself(user);
//        }
//        System.out.println("Вам потребовалось " + dot.numOfHits + " попыток");

    }
    private static int[] createShips() {
        return new int[0];
    }
    private static String getUserInput() {
        return null;
    }
}

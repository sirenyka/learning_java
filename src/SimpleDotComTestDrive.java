public class SimpleDotComTestDrive {
    public static void main(int[] args) {
        DotCom dot = new DotCom();
        int[] location = {2, 3, 4};
//        dot.setLocationCells(location);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "Неудача";
        if (dot.checkYourself(userGuess).equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}


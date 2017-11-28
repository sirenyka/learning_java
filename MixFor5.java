public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outner = 0; outner < 3; outner++) {
            for (int inner = 4; inner > 1; inner--) {
                x--;
                y = y - 2;
                if (x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

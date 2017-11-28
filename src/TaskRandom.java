public class TaskRandom {
    static int count = 0;

    /**
     * Возвращет равновероятно 0 или 1
     *
     * @return
     */
    public static int getRandom2() {
        count++;
        return (int) (Math.random() * 2);
    }

    /**
     * Возвращет равновероятно 0, 1 или 2
     *
     * @return
     */
    public static int getRandom3() {
        // 00, 01, 10, 11
        int res = getRandom2() * 2 + getRandom2(); //0,1,2,3
        if (res < 3) {
            return res;
        } else {
            return getRandom3();
        }
    }

    public static int getRandom3Sasha() {
        int first = 0;
        int second = 0;
        int third = 0;
        while (true) {
            first += getRandom2();
            second += getRandom2();
            third += getRandom2();
//            System.out.print(first + second + third);
//            System.out.println(" ");
            int result = 0;
            if (first > second && first > third) {
                result = 0;
            } else if (second > first && second > third) {
                result = 1;
            } else if (third > first && third > second) {
                result = 2;
            } else {
                return getRandom3Sasha();
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int res = getRandom3Sasha();
            if (res == 0) {
                c1++;
            } else if (res == 1) {
                c2++;
            } else {
                c3++;
            }
        }
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
        System.out.println("count=" + count);
    }


}

public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

        Integer[] listHq  = new Integer[5];
        listHq[0] = null;
        listHq[1] = 1;
        listHq[2] = null;
        listHq[3] = 2;
        listHq[4] = 0;
        int y = 0;
        while (y < 5) {
            if (hq[y] != null) {
                if (hq[y].id == listHq[y]) {
                    System.out.println("true");
                }
//                System.out.println(hq[y].id);
            } else {
                if (listHq[y] == null) {
                    System.out.println("true, null");
                }
            }
// else System.out.println("null");

//            System.out.println(listHq[y]);
            y += 1;
        }
    }
}
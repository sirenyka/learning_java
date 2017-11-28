
public class RandomHelper {
    int first = 0;
    int second = 0;
    int third = 0;


    public void cicle(int[] array) {
        for (int i = 0; i < 3; i++) {
            array[i] += (int) (Math.random() * 2);
            System.out.print(array[i]);
        }
        System.out.println(" ");
//        System.out.println(((int)array[0] + (int)array[1] + (int)array[2]) % 3);
//        return array;
//        System.out.println(2%3);
//        System.out.println(array[0] + array[1] + array[2]);
    }

    public static void main(String[] args) {
        RandomHelper rand = new RandomHelper();
        int[] array = {rand.first, rand.second, rand.third};
        while ((array[0] + array[1] + array[2]) % 3 != 1) {
            rand.cicle(array);
//            int result = (int) ((array[0] + array[1] + array[2]) % 3);
//            System.out.println(result);
        }
//        return;

        int result = 0;
        if (array[0] > array[1] || array[0] > array[2]){
            result = 1;
        }
        if (array[1] > array[0] || array[1] > array[2]) {
            result = 2;
        }
        if (array[2] > array[0] || array[2] > array[1]) {
            result = 3;
        }
        System.out.println(result);
    }
}

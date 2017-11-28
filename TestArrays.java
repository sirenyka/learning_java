class TestArrays {
    public static void main(String[] args) {
        String [] island = new String[4];

        island[0] = "Бермуды";
        island[1] = "Фиджи";
        island[2] = "Азорские о-ва";
        island[3] = "Косумель";

        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.println(island[ref]);
            y = y + 1;
        }
    }
}

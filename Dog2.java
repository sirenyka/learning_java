class Dog2 {
    int size;
    String name;

    int bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Гав!");
            } else if (size > 14) {
                System.out.println("Вуф!");
            } else {
                System.out.println("Тяф!");
            }
            numOfBarks -= 1;
        }
        return size;
    }
}

class Dog2TestDrive {
    public static void main(String[] args) {
        Dog2 one = new Dog2();
        one.size = 70;
        Dog2 two = new Dog2();
        two.size = 8;
        Dog2 three = new Dog2();
        three.size = 35;
        Dog2 four = new Dog2();


        System.out.println(one.bark(1));
        System.out.println(two.bark(2));
        System.out.println(three.bark(3));

    }
}

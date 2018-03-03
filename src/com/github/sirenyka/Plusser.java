package com.github.sirenyka;

public class Plusser {
    private static int one;
    private static int two;
    private static int three;

    public Plusser(int IntOne, int IntTwo, int IntThree) {
        this.one = IntOne;
        this.two = IntTwo;
        this.three = IntThree;
    }

    public static int getOne() {
        return one;
    }

    public static int getTwo() {
        return two;
    }

    public static int getThree() {
        return three;
    }
    public static int summa() {
        return Plusser.getOne() + Plusser.getTwo() + Plusser.getThree();
    }

    public static void main(String[] args) { ;
        System.out.println(Plusser.getOne());
        System.out.println(Plusser.getTwo());
        System.out.println(Plusser.getThree());
        System.out.println(Plusser.summa());

    }
}


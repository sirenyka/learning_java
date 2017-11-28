public class Main {
    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];
        pets[0] = new Dog();
//        if (pets[0] == null) {
//            System.out.println("null");
//        }
        pets[3] = pets[0];
        System.out.println(pets[3]);

        Dog fido = new Dog();
        fido.name = "Fido";
        System.out.println(fido.name);
        fido.bark();
    }
}

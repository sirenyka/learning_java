interface Nose {
    public int iMethod();
}
abstract class Picasso implements Nose{
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso {
}
class Acts extends Clowns {
    public int iMethod() {
        return 5;
    }
}

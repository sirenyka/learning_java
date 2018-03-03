import com.github.sirenyka.Animal;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class MakeHippo {
    public static void main(String[] args) {
        Hippo h = new Hippo("Baffi");
        System.out.println(h.getName());
        Animal animal = new Hippo("q");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        List<Dog> listDogs = dogs;
        List<Animal> animals2 = new ArrayList<Animal>();
        animals.add(new Hippo("hippo"));
        ArrayList<Object> objects = new ArrayList<Object>();
        List<Object> objects1 = objects;
    }
}

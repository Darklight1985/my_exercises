package exercises.cast;

import java.util.ArrayList;
import java.util.List;

public class DownCast {


    public static void main(String[] args) {
        Cat cat = new Cat(1);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);


        Cat cat1 = (Cat) animalList.get(0);
        System.out.println(cat1.getColor());
    }
}

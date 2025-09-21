import ru.yandex.practicum.animal.farm.AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("DOG Арчибальд");
        list.add("DOG Деймон");
        list.add("HORSE Буран");
        list.add("HORSE Быстрый");
        list.add("COW Буренка");
        list.add("GGG Мурка");
        AnimalFarm animalFarm = new AnimalFarm(list);
        animalFarm.countedAnimals();
        animalFarm.uniqueNames();
        animalFarm.add("Жучка");

        System.out.println(animalFarm);
    }
}
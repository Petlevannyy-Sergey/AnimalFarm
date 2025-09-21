package ru.yandex.practicum.animal.farm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AnimalFarm {
    private final List<String> farmAnimals;

    public AnimalFarm(List<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap<Animal, Integer> countedAnimals() {
        HashMap<Animal, Integer> animalMap = new HashMap<>();

        for (String farmAnimal : farmAnimals) {
            try {
                String animalType = farmAnimal.split(" ")[0];
                Animal animal = Animal.valueOf(animalType.toUpperCase());
                Integer currentNumber = animalMap.get(animal);
                animalMap.put(animal, currentNumber == null ? 1 : currentNumber + 1);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
            }
        }
        return animalMap;
    }

    public HashSet<String> uniqueNames() {
        HashSet<String> names = new HashSet<>();

        for (String farmAnimal : farmAnimals) {
            try {
                String[] tmp = farmAnimal.split(" ");
                String name = tmp[1];
                names.add(name);
            } catch (Exception e) {
                System.out.printf("Please correct string %s. Incorrect input data. %n", farmAnimal);
            }
        }

        return names;
    }

    public void add(Animal animal, String name) {
        farmAnimals.add(animal.name() + " " + name);
    }

    public void add(Animal animal) {
        farmAnimals.add(animal.name() + " N");
    }

    public void add(String name){
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ":");
            stringBuilder.append(printFarmAnimal).append("\n");
        }

        return stringBuilder.toString();
    }
}

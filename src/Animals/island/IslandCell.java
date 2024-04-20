package Animals.island;

import Animals.AnimalCount;
import Animals.AnimalSpecies;
import Animals.factory.AnimalFactory;
import Animals.factory.Generation;
import Animals.Animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IslandCell implements Create, Generation {
    private AnimalSpecies plantsAndAnimal;
    private AnimalCount animalCount;
    Map<AnimalSpecies, List<Animals>> mapAnimal = new HashMap<>();
    public AnimalFactory animalFactory = new AnimalFactory();


    @Override
    public void create() {
        createLiveInCell();

    }

    private void createLiveInCell() {
        AnimalSpecies[] types = plantsAndAnimal.values();
        AnimalCount[] count = animalCount.values();

        for (int i = 0; i < types.length; i++) {
            mapAnimal.put(types[i], createAnimal(types[i], toGenerate(count[i].getCount())));
        }
    }

    private List<Animals> createAnimal(AnimalSpecies type, int count) {

        List<Animals> newList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            newList.add(animalFactory.createAnimal(type));
        }
        return newList;
    }

    public Map<AnimalSpecies, List<Animals>> getMapAnimal() {
        return mapAnimal;
    }

}

package Animals.logics;


import Animals.Animals;
import Animals.island.IslandCell;
import Animals.AnimalSpecies;

import java.util.List;

public class BreedingLogic {
    private double maxPercentageReproduction = 0.9;
    private double minPercentageReproduction = 0.5;
    public int startReproduction(Animals object, IslandCell cell) {
        if (cell.getMapAnimal().get(object.getAnimalSpecies()).size() < object.getMaxAnimal()) {
            List<Animals> animals = cell.getMapAnimal().get(object.getAnimalSpecies());
            for (Animals animal : animals) {
                if (animal.isDead() && animal.getFullSatiety() > (animal.getSatiety() * maxPercentageReproduction)) {
                    animals.add(object.reproduction());
                    object.setFullSatiety(object.getFullSatiety() - (object.getSatiety() * minPercentageReproduction));
                    break;
                }
            }
            object.setFullSatiety(object.getFullSatiety() - (object.getSatiety() * minPercentageReproduction));
            return 0;
        } else {
            return 1;
        }
    }
}



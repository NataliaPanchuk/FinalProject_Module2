package Animals.herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.CATERPILLAR;
import static Animals.AnimalSpecies.PLANTS;

public class Duck extends Animals {
    public Duck() {
        super("\\uD83E\\uDD86\\", 1, 0.15, 4, 1, AnimalSpecies.DUCK);
        setMaxAnimal(200);
        setListHunting(List.of(CATERPILLAR, PLANTS));
        setListHuntingPresent(List.of(90, 100));
    }
}

package Animals.Herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Deer extends Animals {
    public Deer() {
        super("\\uD83E\\uDD8C\\", 300, 50, 4, 1, AnimalSpecies.DEER);
        setMaxAnimal(20);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}

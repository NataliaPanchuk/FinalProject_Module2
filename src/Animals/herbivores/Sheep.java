package Animals.herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Sheep extends Animals {
    public Sheep() {
        super("\\uD83D\\uDC11\\", 70, 15, 3, 1, AnimalSpecies.SHEEP);
        setMaxAnimal(140);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}

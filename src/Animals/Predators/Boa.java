package Animals.Predators;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Boa extends Animals {
    public Boa() {
        super("\\uD83D\\uDC0D\\", 15, 3, 1, 1, AnimalSpecies.BOA);
        setMaxAnimal(30);
        setListHunting(List.of(FOX, RABBIT, MOUSE, DUCK));
        setListHuntingPresent(List.of(15, 20, 40, 10));
    }
}

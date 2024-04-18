package Animals.Predators;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Bear extends Animals {
    public Bear() {
        super(" \\uD83D\\uDC3B\\", 500, 80, 2, 1, AnimalSpecies.BEAR);
        setMaxAnimal(5);
        setListHunting(List.of(BOA, HORSE, DEER, RABBIT, MOUSE, GOAT, SHEEP, BOAR, BUFFALO, DUCK));
        setListHuntingPresent(List.of(80, 40, 80, 80, 80, 70, 70, 50, 20, 10));
    }
}

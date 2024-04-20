package Animals.predators;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Wolf extends Animals {
    public Wolf() {
        super("\\uD83D\\uDC3A\\", 50, 8, 3, 1, AnimalSpecies.WOLF);
        setMaxAnimal(30);
        setListHunting(List.of(HORSE, DEER, RABBIT, MOUSE, GOAT, SHEEP, BOAR, BUFFALO, DUCK));
        setListHuntingPresent(List.of(10, 15, 60, 80, 60, 70, 15, 10, 40));
    }
}

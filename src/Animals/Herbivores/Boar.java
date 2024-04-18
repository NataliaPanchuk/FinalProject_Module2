package Animals.Herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Boar extends Animals {
    public Boar() {
        super(" \\uD83D\\uDC17\\ ", 400, 50, 2, 1, AnimalSpecies.BOAR);
        setMaxAnimal(50);
        setListHunting(List.of(MOUSE, CATERPILLAR, PLANTS));
        setListHuntingPresent(List.of(50, 90, 100));
    }


}


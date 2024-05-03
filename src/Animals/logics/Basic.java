package Animals.logics;

import Animals.island.Island;
import Animals.island.IslandCell;
import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;
import java.util.Map;

public class Basic {
    int coordinateX, coordinateY;
    private HuntingLogic huntingLogic = new HuntingLogic();
    private MovementLogic movementLogic = new MovementLogic();
    BreedingLogic breedingLogic = new BreedingLogic();
    private Animals object;
    private Island island;
    private IslandCell[][] earthCell;
    private IslandCell cell;

    public Basic(Island island) {
        this.island = island;
    }

    private void launchBasicLogic() {
        if (object.isDead() && object.getMove() > 0) {
            object.setMove(0);
            if (object.getAnimalSpecies() != AnimalSpecies.PLANTS) {
                if (object.getFullSatiety() >= (object.getSatiety() * object.getPercentageSatiety())) {

                    if (breedingLogic.startReproduction(object, cell) == 0) {
                        return;
                    } else {
                        if (object.getAnimalSpecies() != AnimalSpecies.CATERPILLAR)
                            if (object.toGenerate(100) > 50) {
                                movementLogic.startMove(0, coordinateX, coordinateY, object, earthCell);
                            } else {
                                movementLogic.startMove(1, coordinateX, coordinateY, object, earthCell);
                            }
                    }

                } else {

                    if (huntingLogic.startHunting(object, cell) == 0) {
                        return;
                    } else {
                        if (object.getAnimalSpecies() != AnimalSpecies.CATERPILLAR)
                            if (object.toGenerate(100) > 50) {
                                movementLogic.startMove(0, coordinateX, coordinateY, object, earthCell);
                            } else {
                                movementLogic.startMove(1, coordinateX, coordinateY, object, earthCell);
                            }
                    }

                }
            }
        }
    }

    public void openIsland() {
        earthCell = island.getArrayCell();
        readCell();
    }

    private void openCell() {
        AnimalSpecies[] type = AnimalSpecies.values();
        Map<AnimalSpecies, List<Animals>> mapAnimal = cell.getMapAnimal();
        for (int i = 0; i < type.length; i++) {
            List<Animals> animalList = mapAnimal.get(type[i]);
            for (int j = 0; j < animalList.size(); j++) {
                if (!animalList.isEmpty()) {
                    object = animalList.get(j);
                    launchBasicLogic();
                }
            }

        }
    }

    private void readCell() {
        for (int i = 0; i < earthCell.length; i++) {
            for (int j = 0; j < earthCell[i].length; j++) {
                coordinateX = i;
                coordinateY = j;
                cell = earthCell[i][j];
                openCell();
            }
        }
    }
}

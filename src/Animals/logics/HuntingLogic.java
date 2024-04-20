package Animals.logics;

import java.util.List;

import Animals.Animals;
import Animals.island.IslandCell;

public class HuntingLogic {
    IslandCell earthCell;

    public int startHunting(Animals object, IslandCell cell) {
        earthCell = cell;
        Animals animal = null;
        int typeAnimal = object.toGenerate(object.getListHunting().size() - 1);
        int percent = object.getListHuntingPresent().get(typeAnimal);
        List<Animals> list = cell.getMapAnimal().get(object.getListHunting().get(typeAnimal));
        if (list.isEmpty()) {
            for (int i = 0; i < object.getListHunting().size(); i++) {
                if (!cell.getMapAnimal().get(object.getListHunting().get(i)).isEmpty()) {
                    list = cell.getMapAnimal().get(object.getListHunting().get(i));
                    animal = list.get(object.toGenerate(list.size() - 1));
                    break;
                }
            }
        } else {
            animal = list.get(object.toGenerate(list.size() - 1));
        }
        if (animal != null && animal.isDead()) {
            if (object.toGenerate(100) >= (100 - percent)) {
                object.eat(animal.getWeight());
                animal.setHealth(0);
            } else {
                object.setFullSatiety(object.getFullSatiety() - (object.getSatiety() * 0.2));
            }
            return 0;
        } else {
            return 1;
        }
    }
}

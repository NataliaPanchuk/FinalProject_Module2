package Animals.logics;
import Animals.Animals;
import Animals. AnimalSpecies;
import Animals.island.Island;
import Animals.island.IslandCell;
import java.util.List;

public class DeadLogic {
    List<Animals> animals;
    AnimalSpecies[] types = AnimalSpecies.values();
    public void startClearIsland(Island island){
        openIsland(island.getArrayCell());
    }
    private void openIsland(IslandCell[][] cells){
        for (int i = 0; i <cells.length ; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                openCell(cells[i][j]);
            }

        }
    }
    private void openCell(IslandCell cells){
        for (int i = 0; i < types.length; i++) {
            animals = cells.getMapAnimal().get(types[i]);
            clearDeadAnimal();
        }
    }
    private void clearDeadAnimal(){
        hungryDeath();
        removeDeadAnimal();

    }
    private void removeDeadAnimal(){
        Animals animal = null;
        if(!animals.isEmpty()) {
            for (int i = 0; i < animals.size(); i++) {
                animal = animals.get(i);
                if (animal.getHealth() == 0) {
                    animals.remove(i);
                } else if (animal == null) {
                    animals.remove(i);
                }
            }
        }
    }
    private void hungryDeath(){
        if(!animals.isEmpty())
            for (Animals animal:animals) {
                if(animal.getFullSatiety() < 0.0){
                    animal.setHealth(0);
                }else{
                    animal.setMove(1);
                }
            }
    }
}

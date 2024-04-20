package Animals.logics;

import Animals.AnimalCount;
import Animals.AnimalSpecies;
import Animals.factory.AnimalFactory;
import Animals.factory.Generation;
import Animals.island.Island;
import Animals.island.IslandCell;

public class CreatePlantsLogic implements Generation {
    public void setIsland(Island island) {
        this.island = island;
    }

    AnimalFactory animalFactory = new AnimalFactory();
    Island island;
    public void openIsland(Island island){
        IslandCell[][] earthCells = island.getArrayCell();
        for (int i = 0; i <earthCells.length ; i++) {
            for (int j = 0; j < earthCells[i].length; j++) {
                IslandCell cell = earthCells[i][j];
                if(cell.getMapAnimal().get(AnimalSpecies.PLANTS).size() < AnimalCount.MAX_PLANTS.getCount()){
                    int size = AnimalCount.MAX_PLANTS.getCount() - cell.getMapAnimal().get(AnimalSpecies.PLANTS).size();
                    int random = toGenerate(size);
                    for(int k = 0 ; k < random; k++ )
                        cell.getMapAnimal().get(AnimalSpecies.PLANTS).add(animalFactory.createAnimal(AnimalSpecies.PLANTS));
                }
            }
        }
    }


}

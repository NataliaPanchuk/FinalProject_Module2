package Animals.logics;

import Animals.Animals;
import Animals.island.Island;
import Animals.island.IslandCell;
import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.HashMap;
import java.util.Map;

public class DataOutputLogic {
    public DataOutputLogic() {
        writeKeyMap();
    }

    private Island island;
    AnimalSpecies[] type = AnimalSpecies.values();
    Map<AnimalSpecies, Integer> mapCount = new HashMap<>();

    private void readDataIsland() {
        readDataArrayCell(island.getArrayCell());
    }

    private void readDataArrayCell(IslandCell[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                readDataCell(cells[i][j]);
            }
        }
    }

    private void readDataCell(IslandCell cell) {
        for (int i = 0; i < type.length; i++) {
            int count = cell.getMapAnimal().get(type[i]).size();
            mapCount.merge(type[i], count, Integer::sum);
        }
    }

    private void writeKeyMap() {
        for (int i = 0; i < type.length; i++) {
            mapCount.put(type[i], 0);
        }
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    private void dataOutput() {

        for (int i = 0; i < type.length; i++) {
            System.out.print(type[i] + ": {" + mapCount.get(type[i]) + "} ");
            if (i % 4 == 0 && i > 0) {
                System.out.println();
            } else if (i == type.length - 1) {
                System.out.println();
            }
        }
        System.out.println("------------------------");
        writeKeyMap();
    }

    public void launchLogic(Island is) {
        setIsland(is);
        readDataIsland();
        dataOutput();
    }
}

package Animals.island;

import Animals.AnimalSpecies;

public class Island extends IslandCoordinate {
    public IslandCell[][] getArrayCell() {
        return arrayCell;
    }

    private IslandCell[][] arrayCell;

    public Island() {
        this(2, 2);
    }

    public Island(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }


    @Override
    public void create() {
        createIsland(sizeX, sizeY);
    }


    private void createIsland(int sizeX, int sizeY) {
        arrayCell = new IslandCell[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                arrayCell[i][j] = new IslandCell();
                arrayCell[i][j].create();
            }

        }
    }

    public boolean isLive() {
        boolean status = false;
        AnimalSpecies[] types = AnimalSpecies.values();
        for (int i = 0; i < arrayCell.length; i++) {
            for (int j = 0; j < arrayCell[i].length; j++) {
                for (AnimalSpecies type : types) {
                    if (type != AnimalSpecies.PLANTS) {
                        status = !arrayCell[i][j].getMapAnimal().get(type).isEmpty();
                        if (status) {
                            return true;
                        }
                    }

                }


            }
        }
        return false;
    }
}



package StartApp;

import Animals.island.Island;
import Animals.logics.Basic;
import Animals.logics.CreatePlantsLogic;
import Animals.logics.DataOutputLogic;
import Animals.logics.DeadLogic;

public class RunApp implements Runnable {
    Island island;
    StartApp start;
    Basic logic;
    CreatePlantsLogic createPlantsLogic = new CreatePlantsLogic();
    DeadLogic deadLogic = new DeadLogic();
    DataOutputLogic dataOutputLogic = new DataOutputLogic();

    public void run() {
        start = new StartApp();
        start.Start();
        island = start.getIsland();
        logic = new Basic(island);
        while (island.isLive()) {
            logic.openIsland();
            deadLogic.startClearIsland(island);
            dataOutputLogic.launchLogic(island);
            createPlantsLogic.openIsland(island);

        }
        System.out.println("Live Dead");
    }

}

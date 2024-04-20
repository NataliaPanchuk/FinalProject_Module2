package StartApp;

import Animals.island.Island;

import java.util.Scanner;

public class StartApp {
    public Island getIsland() {
        return island;
    }

    Island island;
    int x,y;
    public void Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the size of the island:");
        System.out.print("X: ");
        x =  scanner.nextInt();
        System.out.print("Y: ");
        y =  scanner.nextInt();
        System.out.println("The creation and filling of the island with life will be introduced.");
        island = new Island(x,y);
        island.create();
        System.out.println(island.isLive());
    }
}

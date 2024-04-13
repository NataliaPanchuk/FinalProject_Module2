package Animals;

import Interfaces.ToDead;
import Interfaces.ToEat;
import Interfaces.ToMove;
import Interfaces.ToReproduction;

public abstract class Animals implements ToDead, ToEat, ToMove, ToReproduction {
    @Override
    public boolean isDead() {
        return false;
    }
}

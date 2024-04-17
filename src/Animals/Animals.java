package Animals;

import Interfaces.ToDead;
import Interfaces.ToEat;
import Interfaces.ToMove;
import Interfaces.ToReproduction;

import java.util.List;

public abstract class Animals implements ToDead, ToEat, ToMove, ToReproduction {
    private AnimalSpecies animalSpecies;
    private char iconAnimal;
    private double weight, satiety, fullSatiety;
    private int speed, health, move;
    //private AnimalFactory factory = new AnimalFactory();
    private List<AnimalSpecies> listHunting;
    private List<Integer> listHuntingPresent;

    public Animals(char iconAnimal, AnimalSpecies animalSpecies, double weight, double satiety, int health) {
        this.iconAnimal = iconAnimal;
        this.animalSpecies = animalSpecies;
        this.weight = weight;
        this.satiety = satiety;
        this.health = health;
        fullSatiety = satiety * 0.80;
        move = 1;
    }

    @Override
    public boolean isDead() {
        return false;
    }
}

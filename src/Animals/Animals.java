package Animals;

import Animals.factory.AnimalFactory;
import Animals.factory.Generation;
import Interfaces.ToDead;
import Interfaces.ToEat;
import Interfaces.ToMove;
import Interfaces.ToReproduction;

import java.util.List;

public abstract class Animals implements ToDead, ToEat, ToMove, ToReproduction, Generation {
    private AnimalSpecies animalSpecies;
    private char iconAnimal;
    private double weight, satiety, fullSatiety;
    private int speed, health, move;
    private AnimalFactory factory = new AnimalFactory();
    private List<AnimalSpecies> listHunting;
    private List<Integer> listHuntingPresent;
    private List<AnimalSpecies> hunting;
    private int maxAnimal;

    public Animals(char iconAnimal, AnimalSpecies animalSpecies, double weight, double satiety, int health) {
        this.iconAnimal = iconAnimal;
        this.animalSpecies = animalSpecies;
        this.weight = weight;
        this.satiety = satiety;
        this.health = health;
        fullSatiety = satiety * 0.80;
        move = 1;
    }
    public void setHunting(List<AnimalSpecies> hunting) {
        this.hunting = hunting;
    }

    public List<AnimalSpecies> getHunting() {
        return hunting;
    }

    public double getFullSatiety() {
        return fullSatiety;
    }

    public void setFullSatiety(double fullSatiety) {
        this.fullSatiety = fullSatiety;
    }

    public int getMaxAnimal() {
        return maxAnimal;
    }

    public void setMaxAnimal(int maxAnimal) {
        this.maxAnimal = maxAnimal;
    }
    public List<AnimalSpecies> getListHunting() {
        return listHunting;
    }

    public void setListHunting(List<AnimalSpecies> listHunting) {
        this.listHunting = listHunting;
    }

    public List<Integer> getListHuntingPresent() {
        return listHuntingPresent;
    }

    public void setListHuntingPresent(List<Integer> listHuntingPresent) {
        this.listHuntingPresent = listHuntingPresent;
    }

    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int getMove() {
        return move;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getIconAnimal() {
        return iconAnimal;
    }

    public void setIconAnimal(char iconAnimal) {
        this.iconAnimal = iconAnimal;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public boolean isDead() {
        return(health > 0);
    }

    @Override
    public Animals reproduction() {
        return factory.createAnimal(getAnimalSpecies());
    }

    @Override
    public int toMove() {
        return toGenerate(speed);
    }

    @Override
    public void toEat(double food) {
        if(food >= satiety){
            fullSatiety = satiety;
        } else if (food < satiety){
            if((fullSatiety + food) >= satiety){
                fullSatiety = satiety;
            } else{
                fullSatiety+=food;
            }
        }
    }
}

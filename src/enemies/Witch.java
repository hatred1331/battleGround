package enemies;

import heroes.Hero;

public class Witch extends Enemy{
    public Witch() {
    }

    public Witch(int health, int damage) {
        super(health, damage);
    }

    public void suddenDeath(Hero hero){
        hero.setHealth(0);
    }
}

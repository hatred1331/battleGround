package enemies;

import heroes.Hero;

public class Enemy implements Mortal {
    protected int health;
    protected int damage;
    public Enemy(){};

    public  Enemy(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public void attackHero(Hero hero){
        hero.takeDamage(damage);
    }

    public boolean isAlive(){
        if(health > 0)
            return true;
        else return false;
    }


}

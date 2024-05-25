package heroes;
import enemies.*;

public abstract class Hero implements Mortal{
    protected String name;
    protected  int damage;
    protected int health;
    public Hero(){};

    public Hero(String name, int damage, int health){
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);
//        System.out.println("Hero " + name + " attacks enemy with " + enemy.getHealth() + " HP");
//        enemy.takeDamage(damage);

    public boolean isAlive(){
        if(health > 0)
            return true;
        else return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
    }
}

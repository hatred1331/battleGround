package heroes;
import enemies.*;

public class Archer extends Hero{
    public Archer() {
    }

    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if(enemy.isAlive()) {
                System.out.println("Archer " + name + " attacks enemy with " + enemy.getHealth() + " HP");
                enemy.takeDamage(damage);
            }
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Archer id dead, he cant attack anymore");
    }

    public void tripleShot(Enemy enemy){
        if(isAlive()){
            if(enemy.isAlive())
                enemy.takeDamage(damage * 3);
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Archer id dead, he cant attack anymore");
    }
}

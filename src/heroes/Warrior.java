package heroes;
import enemies.*;
public class Warrior extends Hero{
    public Warrior() {
    }

    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(isAlive()) {
            if(enemy.isAlive())
            {
            System.out.println("Warrior " + name + " attacks enemy with " + enemy.getHealth() + " HP");
            enemy.takeDamage(damage);
            }
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Warrior is dead");
    }

    public void vampireAttack(Enemy enemy){
        if(isAlive()) {
            if(enemy.isAlive()) {
                enemy.takeDamage(damage);
                health += damage / 2;
            }
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Warrior is dead");
    }
}

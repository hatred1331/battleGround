package heroes;
import enemies.*;

public class Mage extends Hero{
    private int mana;

    public Mage() {
    }

    public Mage(String name, int damage, int health, int mana) {
        super(name, damage, health);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean isMana(){
        if(mana > 0)
            return true;
        else return false;

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(isAlive()) {
            if(enemy.isAlive()) {
                System.out.println("Mage " + name + " attacks enemy with " + enemy.getHealth() + " HP");
                enemy.takeDamage(damage);
            }
            else System.out.println("Enemy's already dead");

        }
        else System.out.println("Mage is dead");
    }

    public void attackEnemy(Enemy enemy, int mana) {
        if(isAlive()) {
            if(enemy.isAlive()) {
                if (isMana() && this.mana >= mana) {
                    System.out.println("Mage " + name + " attacks enemy with " + enemy.getHealth() + " HP");
                    enemy.takeDamage(damage + mana / 2);
                } else System.out.println("Mage is out of mana");
            }
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Mage is dead");
    }

    public void manaAttack(Enemy enemy){
        if(isAlive()) {
            if(enemy.isAlive()) {
                if (isMana() && mana < health) {
                    enemy.takeDamage(mana);
                    setMana(0);
                    setHealth(1);
                } else System.out.println("No mana for this attack");
            }
            else System.out.println("Enemy's already dead");
        }
        else System.out.println("Mage is dead");
    }
}

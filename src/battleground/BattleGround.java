package battleground;

import enemies.Enemy;
import enemies.Witch;
import enemies.Zombie;
import heroes.Archer;
import heroes.Mage;
import heroes.Warrior;

public class BattleGround {
    public  static void main(String[] args){
        // Create heroes
        Warrior warrior = new Warrior("War", 9, 150);
        Archer archer = new Archer("Archer", 15, 100);
        Mage mage = new Mage("Mage", 20, 80, 100);
        Mage zero = new Mage("Zero", 30, 120, 100);


        // Create enemies
        Enemy enemy = new Enemy(50, 10);
        Zombie zombie = new Zombie(50, 10);
        Witch witch = new Witch(80, 20);

        // Warrior fights vs enemy
        warrior.attackEnemy(enemy);
        enemy.attackHero(warrior);
        System.out.println(warrior.getHealth());
        System.out.println(enemy.getHealth());
        warrior.vampireAttack(enemy);
        System.out.println(warrior.getHealth());
        System.out.println(enemy.getHealth());

        System.out.println("------------------------------");

        // archer fights vs zombie
        archer.attackEnemy(zombie);
        zombie.attackHero(archer);
        System.out.println(archer.getHealth());
        System.out.println(zombie.getHealth());
        archer.tripleShot(zombie);

        System.out.println("------------------------------");

        // mage fights vs witch
        mage.attackEnemy(witch);
        witch.attackHero(mage);
        System.out.println(mage.getHealth());
        System.out.println(witch.getHealth());
        mage.attackEnemy(witch, 10);
        System.out.println(witch.getHealth());
        witch.suddenDeath(mage);
        mage.attackEnemy(witch);
        System.out.println(mage.getHealth());
        System.out.println(witch.getHealth());

        System.out.println("------------------------------");

        // Zero fight with enemy
        System.out.println(enemy.isAlive());
        zero.manaAttack(enemy);
        System.out.println(zero.getHealth());
        System.out.println(zero.getMana());
        System.out.println(enemy.getHealth());

        warrior.attackEnemy(enemy);




    }



}

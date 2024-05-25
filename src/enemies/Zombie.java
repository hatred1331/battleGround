package enemies;

import java.util.Random;

public class Zombie extends Enemy{
    public Zombie() {
    }

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if(health <= 0) {
            Random random = new Random();
            double randomNumber = random.nextDouble();
            int roundedNumber = (int) Math.round(randomNumber);
            if (roundedNumber > 0) {
                health = damage / 2;
                System.out.println("Oh no, Zombie is alive!");
            }
            else System.out.println("Zombie is dead");
        }
    }



//    @Override
//    public boolean isAlive(){
//        if(health > 0)
//            return true;
//        else {
//            Random random = new Random();
//            double randomNumber = random.nextDouble();
//            int roundedNumber = (int) Math.round(randomNumber);
//            if(roundedNumber > 0){
//                health = 50;
//                System.out.println("Oh no, Zombie is alive!");
//                return true;
//            }
//            else return false;
//        }
//    }

}

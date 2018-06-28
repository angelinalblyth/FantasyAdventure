package Dungeon;

import Enemies.Enemy;
import Heroes.Damage.Damage;
import Heroes.Healer.Healer;
import Heroes.Hero;
import Heroes.Tank.Tank;
import Heroes.Tank.Warrior;
import Interfaces.IDefend;
import Items.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Hero> heroes;
    private ArrayList<Treasure> treasures;
    private Treasure treasure;

    public Room() {
        this.enemies = new ArrayList<Enemy>();
        this.heroes = new ArrayList<Hero>();
        this.treasures = new ArrayList<Treasure>();
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }


    public int getNumberOfEnemies() {
        return enemies.size();
    }

    public int getNumberOfHeroes() {
        return heroes.size();
    }

    public int getNumberOfTreasures() {
        return treasures.size();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    public void enemiesAttack() {
        for (Enemy enemy : this.enemies) {
            for (Hero hero : this.heroes) {
                if (hero instanceof Healer) {
                    hero.takeDamage(enemy.getAttackStrength());
                    }
                }
                for (Hero hero : this.heroes){
                int totalDamage = 0;
                if (hero instanceof Tank){
                    totalDamage = enemy.getAttackStrength() - ((Tank) hero).getArmourStrength();
                    hero.takeDamage(totalDamage);
                }
            }
            for (Hero hero : this.heroes){
                if (hero instanceof Damage){
                    if (((Damage) hero).getMinionDefenceStrength() > 0){
                        ((Damage) hero).applyDamageToMinion(enemy.getAttackStrength());
                    }
                    else {hero.takeDamage(enemy.getAttackStrength());
                }
            }
        }
    }
}
}


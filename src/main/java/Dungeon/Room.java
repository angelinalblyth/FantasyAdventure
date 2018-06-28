package Dungeon;

import Enemies.Enemy;
import Heroes.Hero;
import Items.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Hero> heroes;
    private ArrayList<Treasure> treasures;

    public Room() {
        this.enemies = new ArrayList<Enemy>();
        this.heroes = new ArrayList<Hero>();
        this.treasures = new ArrayList<Treasure>();
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

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public void addHero(Hero hero){
        heroes.add(hero);
    }

    public void addTreasure(Treasure treasure){
        treasures.add(treasure);
    }
}

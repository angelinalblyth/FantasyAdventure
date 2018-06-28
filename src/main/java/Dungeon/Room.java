package Dungeon;

import Enemies.Enemy;
import Heroes.Hero;
import Items.EnumTreasure;
import Items.Treasure;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Hero> heroes;
    private ArrayList<EnumTreasure> treasures;

    public Room() {
        this.enemies = new ArrayList<Enemy>();
        this.heroes = new ArrayList<Hero>();
        this.treasures = new ArrayList<EnumTreasure>();
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

    public void addTreasure(EnumTreasure treasure){
        treasures.add(treasure);
    }
}

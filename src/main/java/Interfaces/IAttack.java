package Interfaces;

import Enemies.Enemy;
import Heroes.Hero;

import java.util.ArrayList;

public interface IAttack {


    // Enemy is attacking
    int enemyAttack(ArrayList<Enemy> enemies);


    //Hero is attacking
    int heroAttack(ArrayList<Hero> heroes);


}

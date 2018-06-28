import Dungeon.Room;
import Enemies.Enemy;
import Heroes.Damage.Warlock;
import Heroes.Healer.Priest;
import Heroes.Tank.Tank;
import Heroes.Tank.Warrior;
import Items.Armour;
import Items.Treasure;
import Items.Weapon;
import Specials.HealingTool;
import Specials.Minion;
import Specials.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    Room room;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;
    Warlock warlock;
    Spell fireball;
    Minion igor;
    Warrior warrior;
    Armour armour;
    Weapon weapon;
    Priest priest;
    HealingTool healingtool;
    Treasure treasure;

    @Before
    public void setUp() throws Exception {
        room = new Room();
        enemy1 = new Enemy("Rat 1", 10, 2, 5, 5);
        enemy2 = new Enemy("Rat 2", 10, 2, 5, 5);
        enemy3 = new Enemy("Rat 3", 10, 2, 5, 5);
        fireball = new Spell(25);
        igor = new Minion(20);
        warlock = new Warlock(100, 100, 1, fireball, igor);
        weapon = new Weapon(50);
        armour = new Armour(50);
        warrior = new Warrior(100, 10, 1, weapon, armour);
        healingtool = new HealingTool(30);
        priest = new Priest(100, 100, 1, healingtool);
        treasure = Treasure.DIAMOND;



        room.addEnemy(enemy1);
        room.addEnemy(enemy2);
        room.addEnemy(enemy3);

        room.addHero(warlock);
        room.addHero(warrior);
        room.addHero(priest);

        room.addTreasure(treasure);
    }
//
//    @Test
//    public void enemyListIsEmpty(){
//        assertEquals(0, room.getNumberOfEnemies());
//    }
//
//    @Test
//    public void canAddEnemy(){
//        room.addEnemy(enemy1);
//        assertEquals(1, room.getNumberOfEnemies());
//    }
//
//    @Test
//    public void canAddHero(){
//        room.addHero(warlock);
//        assertEquals(1, room.getNumberOfHeroes());
//    }
//
//    @Test
//    public void canAddTreasure(){
//        room.addTreasure(treasure);
//        assertEquals(1, room.getNumberOfTreasures());
//    }

    @Test
    public void priestTakesDamage(){
        room.enemiesAttack();
        assertEquals(85, room.getHeroes().get(2).getHP());
    }
}

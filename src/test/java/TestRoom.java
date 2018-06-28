import Dungeon.Room;
import Enemies.Enemy;
import Heroes.Damage.Warlock;
import Heroes.Healer.Priest;
import Heroes.Tank.Warrior;
import Items.Treasure;
import Specials.Minion;
import Specials.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    Room room;
    Enemy enemy;
    Warlock warlock;
    Spell fireball;
    Minion igor;
    Treasure treasure;

    @Before
    public void setUp() throws Exception {
        room = new Room();
        enemy = new Enemy("Rat", 10, 2, 5, 5);
        warlock = new Warlock(100, 100, 1, fireball, igor);
        treasure = new Treasure(10);
    }

    @Test
    public void enemyListIsEmpty(){
        assertEquals(0, room.getNumberOfEnemies());
    }

    @Test
    public void canAddEnemy(){
        room.addEnemy(enemy);
        assertEquals(1, room.getNumberOfEnemies());
    }

    @Test
    public void canAddHero(){
        room.addHero(warlock);
        assertEquals(1, room.getNumberOfHeroes());
    }

    @Test
    public void canAddTreasure(){
        room.addTreasure(treasure);
        assertEquals(1, room.getNumberOfTreasures());
    }
}

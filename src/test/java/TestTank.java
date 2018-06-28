import Heroes.Tank;
import Items.Armour;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTank {

    Tank warrior;
    Tank palladin;
    Tank deathknight;
    Weapon sword;
    Armour plate;

    @Before
    public void setUp() throws Exception {
       sword = new Weapon(50);
       plate = new Armour(50);
       warrior = new Tank (100, 10, 1, sword, plate);
       palladin = new Tank(100, 10, 1, sword, plate);
       deathknight = new Tank(100, 10, 1, sword, plate);
    }

    @Test
    public void heroesHaveHP() {
        assertEquals(100, warrior.getHP());
        assertEquals(100, palladin.getHP());
        assertEquals(100, deathknight.getHP());
    }

    @Test
    public void heroesHaveMP() {
        assertEquals(10, warrior.getMP());
        assertEquals(10, palladin.getMP());
        assertEquals(10, deathknight.getMP());
    }

    @Test
    public void heroesHaveLevel() {
        assertEquals(1, warrior.getLevel());
        assertEquals(1, palladin.getLevel());
        assertEquals(1, deathknight.getLevel());
    }

    @Test
    public void heroesWeaponHasAttackStrength() {
        assertEquals(50, warrior.getWeaponAttackStrength());
        assertEquals(50, palladin.getWeaponAttackStrength());
        assertEquals(50, deathknight.getWeaponAttackStrength());
    }

    @Test
    public void heroesHaveArmourStrength() {
        assertEquals(50, warrior.getArmourStrength());
        assertEquals(50, palladin.getArmourStrength());
        assertEquals(50, deathknight.getArmourStrength());
    }
}

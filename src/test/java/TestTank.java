import Heroes.Tank.Tank;
import Items.Armour;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTank {

    Tank tank;
    Weapon sword;
    Armour plate;

    @Before
    public void setUp() throws Exception {
       sword = new Weapon(50);
       plate = new Armour(50);
       tank = new Tank (100, 10, 1, sword, plate);
    }

    @Test
    public void heroesHaveHP() {
        assertEquals(100, tank.getHP());
    }

    @Test
    public void heroesHaveMP() {
        assertEquals(10, tank.getMP());
    }

    @Test
    public void heroesHaveLevel() {
        assertEquals(1, tank.getLevel());
    }

    @Test
    public void heroesWeaponHasAttackStrength() {
        assertEquals(50, tank.getWeaponAttackStrength());
    }

    @Test
    public void heroesHaveArmourStrength() {
        assertEquals(50, tank.getArmourStrength());
    }
}

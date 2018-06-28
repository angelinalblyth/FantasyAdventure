import Heroes.Tank.Warrior;
import Items.Armour;
import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWarrior {

    Warrior warrior;
    Weapon sword;
    Armour plate;

    @Before
    public void setUp() throws Exception {
        sword = new Weapon(50);
        plate = new Armour(50);
        warrior = new Warrior(100, 10, 1, sword, plate);
    }

    @Test
    public void warriorHasHP() {
        assertEquals(100, warrior.getHP());
    }
}

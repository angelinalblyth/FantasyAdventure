import Enemies.Enemy;
import Heroes.Healer.Priest;
import Specials.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPriest {

    Priest priest;
    Enemy enemy;
    HealingTool healingSurge;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Rat", 10, 2, 5, 5);
        healingSurge = new HealingTool(30);
        priest = new Priest(100, 100, 1, healingSurge);
    }

    @Test
    public void canTakeDamage() {
        priest.takeDamage(5);
        assertEquals(95, priest.getHP());
    }
}

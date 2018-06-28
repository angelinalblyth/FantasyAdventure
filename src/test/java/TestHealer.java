import Heroes.Healer.Healer;
import Specials.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHealer {

    Healer healer;
    HealingTool healingSurge;


    @Before
    public void setUp() throws Exception {
        healingSurge = new HealingTool(30);
        healer = new Healer(100, 100, 1, healingSurge);
    }

    @Test
    public void healerHasHP() {
        assertEquals(100, healer.getHP());
    }

    @Test
    public void healerHealingStrength() {
        assertEquals(30, healer.getHealingStrength());
    }
}

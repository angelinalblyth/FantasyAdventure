import Heroes.Damage;
import Specials.Minion;
import Specials.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDamage {

    Damage warlock;
    Damage mage;
    Spell fireball;
    Minion igor;

    @Before
    public void setUp() throws Exception {
        fireball = new Spell(25);
        igor = new Minion(20);
        warlock = new Damage(100, 50, 1, fireball, igor);
    }


    @Test
    public void hasHP(){
        assertEquals(100, warlock.getHP());
    }

    @Test
    public void hasMP(){
        assertEquals(50, warlock.getMP());
    }

    @Test
    public void hasLevel(){

    }

}

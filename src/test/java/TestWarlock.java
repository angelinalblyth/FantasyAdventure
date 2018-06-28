import Heroes.Damage.Warlock;
import Specials.Minion;
import Specials.Spell;
import org.junit.Before;
import org.junit.Test;

public class TestWarlock {

    Warlock warlock;
    Spell fireball;
    Minion igor;

    @Before
    public void setUp() throws Exception {
        fireball = new Spell(25);
        igor = new Minion(20);
        warlock = new Warlock(100, 100, 1, fireball, igor);
    }

    @Test
    public void name() {

    }
}

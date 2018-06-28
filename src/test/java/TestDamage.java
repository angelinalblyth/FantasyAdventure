import Heroes.Damage.Damage;
import Specials.Minion;
import Specials.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDamage {

    Damage damage;
    Spell fireball;
    Minion igor;

    @Before
    public void setUp() throws Exception {
        fireball = new Spell(25);
        igor = new Minion(20);
        damage = new Damage(100, 50, 1, fireball, igor);
    }


    @Test
    public void hasHP(){
        assertEquals(100, damage.getHP());
    }

    @Test
    public void hasMP(){
        assertEquals(50, damage.getMP());
    }

    @Test
    public void hasLevel(){
    assertEquals(1, damage.getLevel());
    }

    @Test
    public void damageHasAttackStrength() {
        assertEquals(25, damage.getSpellStrength());
    }

    @Test
    public void damangeHasMinionDefence() {
        assertEquals(20, damage.getMinionDefenceStrength());
    }
}

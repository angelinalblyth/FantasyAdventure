import Enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnemy {

    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Rat", 10, 2, 5, 5);
    }

    @Test
    public void ratHasName(){
        assertEquals("Rat", enemy.getName());
    }


}

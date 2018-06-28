package Heroes.Damage;

import Enemies.Enemy;
import Heroes.Hero;
import Specials.Minion;
import Specials.Spell;

import java.util.ArrayList;

public class Damage extends Hero {

    private Spell spell;
    private Minion minion;

    public Damage(int HP, int MP, int level, Spell spell, Minion minion) {
        super(HP, MP, level);
        this.spell = spell;
        this.minion = minion;
    }

    public int getSpellStrength() {
        return spell.getAttackStrength();
    }

    public int getMinionDefenceStrength() {
        return minion.getDefenceStrength();
    }

    public void applyDamageToMinion(int damage) {
        minion.takeDamage(damage);
    }

}

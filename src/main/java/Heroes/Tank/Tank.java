package Heroes.Tank;

import Heroes.Hero;
import Items.Armour;
import Items.Treasure;
import Items.Weapon;

import java.util.ArrayList;

public class Tank extends Hero {

    private Weapon weapon;
    private Armour armour;

    public Tank(int HP, int MP, int level, Weapon weapon, Armour armour) {
        super(HP, MP, level);
        this.weapon = weapon;
        this.armour = armour;
    }

    public int getWeaponAttackStrength() {
        return this.weapon.getAttackstrength();
    }

    public int getArmourStrength() {
        return this.armour.getArmourstrength();
    }
}

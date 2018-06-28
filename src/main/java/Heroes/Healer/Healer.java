package Heroes.Healer;

import Enemies.Enemy;
import Heroes.Hero;
import Interfaces.IDefend;
import Specials.HealingTool;

import java.util.ArrayList;

public class Healer extends Hero {

    private HealingTool healingTool;

    public Healer(int HP, int MP, int level, HealingTool healingTool) {
        super(HP, MP, level);
        this.healingTool = healingTool;
    }

    public int getHealingStrength() {
        return healingTool.getHealingStrength();
    }



}

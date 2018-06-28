package Heroes.Healer;

import Heroes.Hero;
import Specials.HealingTool;

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

package Heroes.Healer;

import Enemies.Enemy;
import Heroes.Hero;
import Interfaces.IDefend;
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


    public int enemyAttack() {
        for(Enemy enemy: )
    }

    public int heroAttack(Hero hero, Enemy enemy) {

    }
}

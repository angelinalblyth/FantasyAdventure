package Specials;

import Interfaces.IDefend;

public class Minion implements IDefend {

    private int defenceStrength;

    public Minion(int defenceStrength) {

        this.defenceStrength = defenceStrength;

    }

    public int getDefenceStrength() {
        return defenceStrength;
    }


    public void takeDamage(int attackValue) {
        this.defenceStrength -= attackValue;
    }
}

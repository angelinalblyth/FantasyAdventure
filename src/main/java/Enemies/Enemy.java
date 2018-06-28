package Enemies;

public class Enemy {

    private String name;
    private int HP;
    private int expValue;
    private int attackStrength;
    private int defenceStrength;

    public Enemy(String name, int HP, int expValue, int attackStrength, int defenceStrength) {
        this.name = name;
        this.HP = HP;
        this.expValue = expValue;
        this.attackStrength = attackStrength;
        this.defenceStrength = defenceStrength;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getExpValue() {
        return expValue;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getDefenceStrength() {
        return defenceStrength;
    }
}

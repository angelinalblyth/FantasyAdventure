package Heroes;

import Items.Treasure;

import java.util.ArrayList;

public abstract class  Hero {

    private int HP;
    private int MP;
    private int level;
    private ArrayList<Treasure> bag;


    public Hero(int HP, int MP, int level) {
        this.HP = HP;
        this.MP = MP;
        this.level = level;
        this.bag = new ArrayList<Treasure>();
    }

    public int getHP() {
        return HP;
    }

    public int getLevel() {
        return level;
    }


    public int getMP() {
        return MP;
    }

    public ArrayList<Treasure> getBag() {
        return bag;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
}

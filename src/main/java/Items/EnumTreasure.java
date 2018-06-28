package Items;

public enum EnumTreasure {

    BRONZECROWN(10, "Bronze Crown"),
    SILVERCROWN(15, "Silver Crown"),
    GOLDCROWN(25, "Gold Crown"),
    SAPPHIRE(30, "Sapphire"),
    RUBY(40, "Ruby"),
    DIAMOND(60, "Diamond"),
    CURSERELIC(10, "Curse Relic");

    private final int value;
    private final String objectName;

    EnumTreasure(int value, String objectName) {
        this.value = value;
        this.objectName = objectName;
    }

    public int getValue() {
        return value;
    }

    public String getObjectName() {
        return objectName;
    }
}

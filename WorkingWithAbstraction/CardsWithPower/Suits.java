package WorkingWithAbstraction.CardsWithPower;

public enum Suits {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 13),
    HEARTS("HEARTS", 26),
    SPADES("SPADES", 39);



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private String type;
    private int value;
    Suits(String type, int value) {
        this.type = type;
        this.value = value;
    }
}

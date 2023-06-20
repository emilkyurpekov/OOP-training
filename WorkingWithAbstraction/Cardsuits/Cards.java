package WorkingWithAbstraction.Cardsuits;

public enum Cards {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 1),
    HEARTS("HEARTS", 2),
    SPADES("SPADES", 3);

    Cards(String type, int value) {
        this.type = type;
        this.value = value;
    }

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
}
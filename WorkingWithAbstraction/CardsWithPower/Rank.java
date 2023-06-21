package WorkingWithAbstraction.CardsWithPower;

public enum Rank {

    TWO("TWO", 2),
    THREE("THREE", 3),
    FOUR("FOUR", 4),
    FIVE("FIVE", 5),
    SIX("SIX", 6),
    SEVEN("SEVEN", 7),
    EIGHT("EIGHT", 8),
    NINE("NINE", 9),
    TEN("TEN", 10),
    JACK("JACK", 11),
    QUEEN("QUEEN", 12),
    KING("KING", 13),
    ACE("ACE", 14);
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    //(ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING)
    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }
}

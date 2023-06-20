package WorkingWithAbstraction.HotelReservation;

public enum Season {
    Summer("Summer", 4),
    Autumn("Autumn", 1),
    Winter("Winter", 3),
    Sring("Spring",2);


    private String name;

    private  int multiplier;
    Season(String name, int multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }





}

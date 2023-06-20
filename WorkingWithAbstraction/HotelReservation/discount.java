package WorkingWithAbstraction.HotelReservation;

public enum discount {
    VIP("VIP", 20),
    SecondVisit("SecondVisit",10),
    None("None", 0);


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    private  String type;
    private  int percentage;

    discount(String type, int percentage) {
        this.type = type;
        this.percentage = percentage;
    }
}

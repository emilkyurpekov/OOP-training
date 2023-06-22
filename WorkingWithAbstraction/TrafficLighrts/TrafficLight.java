package WorkingWithAbstraction.TrafficLighrts;

public class TrafficLight {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TrafficLight(Color color) {
        this.color = color;
    }
    public void changeLightColor(){
        switch(color){
            case RED:
                color = Color.GREEN;
                break;
            case YELLOW:
                color = Color.RED;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
        }
    }
}

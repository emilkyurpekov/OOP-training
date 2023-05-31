package ClassesAndObjects.EX03;

public class Engine {
    private  int speed;
    private  int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    // {EngineSpeed} {EnginePower}
}
//{CargoWeight} {CargoType}
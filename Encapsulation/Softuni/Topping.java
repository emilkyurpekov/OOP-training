package Softuni;

public class Topping {
    private String toppingType;
    private double weight;

    private void setToppingType(String toppingType) {
        if (this.toppingType.equals("Meat")) {
            this.toppingType = toppingType;
        } else if (this.toppingType.equals("Veggies")) {
            this.toppingType = toppingType;
        } else if (this.toppingType.equals("Cheese")) {
            this.toppingType = toppingType;
        } else if (this.toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            String message = "Cannot place " + toppingType + " on top of your pizza.";
            throw new IllegalArgumentException(message);
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            String message = toppingType + " weight should be in the range [1..50].";
            throw new IllegalArgumentException(message);
        }

    }

    public Topping(String toppingType, double weight) {
        this.toppingType = toppingType;
        this.weight = weight;
    }

    public double calculateCalories() {
        double toppingTypeCoefficient = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingTypeCoefficient = 1.2;
                break;
            case "Veggies":
                toppingTypeCoefficient = 0.8;
                break;
            case "Cheese":
                toppingTypeCoefficient = 1.1;
                break;
            case "Sauce":
                toppingTypeCoefficient = 0.9;
                break;
        }
        return 2 * weight * toppingTypeCoefficient;
    }
}
//•	Meat – 1.2;
//•	Veggies – 0.8;
//•	Cheese – 1.1;
//•	Sauce – 0.9;
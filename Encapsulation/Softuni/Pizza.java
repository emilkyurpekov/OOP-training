package Softuni;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (this.name.length() >= 1 && this.name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dought) {
        this.dough = dought;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    private void setToppings(int count) {
        if (count >= 0 && count <= 10) {
            this.toppings = new ArrayList<>(count);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

    }

    public Pizza(String name, List<Topping> toppings) {

    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        return dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }

}

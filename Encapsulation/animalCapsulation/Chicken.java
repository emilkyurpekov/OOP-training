package Encapsulation.animalCapsulation;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

    }


    public double productPerDay () {
        return this.calculateProductPerDay();
    }


    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.getName(), this.getAge(), this.productPerDay());
    }

    private double calculateProductPerDay() {
        if (this.age >= 0 && this.age <= 5) {
            return 2;
        } else if (this.age >= 6 && this.age <= 12) {
            return 1;
        } else {
            return 0.75;
        }
    }
}

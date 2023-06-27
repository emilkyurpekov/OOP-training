package Softuni;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public String getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

    }

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public double calculateCalories() {
        double flourTypeCoefficient = 0;
        if (this.flourType.equals("White")) {
            flourTypeCoefficient = 1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            flourTypeCoefficient = 1.0;
        }
        double bakingTechniqueCoefficient = 0;
        if (this.bakingTechnique.equals("Crispy")) {
            bakingTechniqueCoefficient = 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            bakingTechniqueCoefficient = 1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            bakingTechniqueCoefficient = 1.0;
        }

        return (2 * this.weight) * flourTypeCoefficient * bakingTechniqueCoefficient;
    }
}
//-	flourType: String
//-	bakingTechnique: String
//-	weight: double
//+ 	Dought (String, String, double)
//-	setWeight(double): void
//-	setFlourType(String): void
//-	setBakingTechnique(String): void
//+	calculateCalories (): double
package BirthdayCelebrations;

public class Pet implements  Birthable{
    private String name;
    private String birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}

package BirthdayCelebrations;

public interface Person extends Identifiable, Birthable {
    String getBirthDate();

    String getId();

    String getName();

    int getAge();
}

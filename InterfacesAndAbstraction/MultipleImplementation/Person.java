package InterfacePerson;

public interface Person extends Identifiable, Birthable {
    String getBirthDate();

    String getId();

    String getName();

    int getAge();
}

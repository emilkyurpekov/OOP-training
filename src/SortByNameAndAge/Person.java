package SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private double salary;
    private int age;
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 460){
            throw  new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.toCharArray().length <3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.toCharArray().length < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
       setFirstName(firstName);
       setLastName(lastName);
       setAge(age);
       setSalary(salary);
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() >= 30) {
            this.salary = this.salary + this.salary * bonus / 100;
        }else{
            this.salary = this.salary + this.salary * bonus / 200;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", this.getFirstName(), this.getLastName(), this.getSalary());
    }
}

package SortByNameAndAge;

import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Person> getFirstTeam() {
        return firstTeam;
    }

    public List<Person> getReserveTeam() {
        return reserveTeam;
    }
    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeam.add(person);
        }
        else{
            reserveTeam.add(person);
        }
    }
}

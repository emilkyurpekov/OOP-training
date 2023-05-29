package ClassesAndObjects.EX01;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> personData = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] personalData = scanner.nextLine().split("\\s+");
            String name = personalData[0];
            int age =Integer.parseInt(personalData[1]);
            Person person = new Person(name,age);
            if(person.age>30){
                personData.put(person.name,person.age);
            }
        }
        for (Map.Entry<String, Integer> s : personData.entrySet()) {
            System.out.printf("%s - %d\n", s.getKey(), s.getValue());
        }
    }
}

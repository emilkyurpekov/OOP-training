package WorkingWithAbstraction.Cardsuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Card Suits:");
        for (Cards value : Cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.getValue(),value);
        }
    }
}

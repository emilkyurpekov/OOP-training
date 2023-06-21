package WorkingWithAbstraction.CardsWithPower;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        Card card = new Card(Suits.valueOf(suit),Rank.valueOf(rank));
        int power = card.getSuit().getValue() + card.getRank().getValue();
        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,power);
    }
}

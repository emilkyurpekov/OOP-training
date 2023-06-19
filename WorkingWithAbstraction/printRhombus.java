import java.util.Scanner;

public class printRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            printRow(i, n - i);
        }
        for (int i = n - 1; i > 0; i--) {
            printRow(i, n - i);
        }
    }
    public static void printRow(int stars, int leadSpaces) {
        for (int i = 0; i < leadSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < stars; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

package WorkingWithAbstraction.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        double pricePerDay = Double.parseDouble(inputArr[0]);
        int days = Integer.parseInt(inputArr[1]);
        Season season = Season.valueOf(inputArr[2]);
        discount Discount = discount.valueOf(inputArr[3]);
        double Total = PriceCalculator.calculateHolidayPrice(pricePerDay, days, season, Discount);
        System.out.printf("%.2f",Total);
    }
}

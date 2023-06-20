package WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {

    public static double calculateHolidayPrice(double price, int days, Season season, discount discount){
        double priceTotal = price * days;
        priceTotal*=  season.getMultiplier();
        priceTotal-= priceTotal * (discount.getPercentage() / 100.0);
        return priceTotal;
    }
}

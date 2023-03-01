public class BonusMilesService {
    public int calculate (int ticketPrice) {

        int priceOfMile = 20; // Price of one bonus mile
        int countMiles = ticketPrice / priceOfMile; // Count bonus miles

        return countMiles;
    }
}

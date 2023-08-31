public class BonusMilesService {
    public static int calculate(int ticketCost) {
        int mileCost = 20;
        return Math.round((float) ticketCost / mileCost);
    }
}

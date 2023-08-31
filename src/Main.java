public class Main {
    public static void main(String[] args) {
        int ticketCost = 24376;
        int milesCount = BonusMilesService.calculate(ticketCost);
        System.out.printf("Стоимость билета: %s%n", ticketCost);
        System.out.printf("Стоимость начислено миль: %s%n", milesCount);
    }
}
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket = 2000;
        int bonusMiles = service.calculate(priceTicket);
        System.out.println(bonusMiles);
    }
}


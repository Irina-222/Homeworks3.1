public class BonusMilesService {
    //BonusMilesService calculate = new BonusMilesService ();
    public int calculate(int amountTicket) {
        int amountRuble = 20;

        int amountMiles = (amountTicket / amountRuble);

        return amountMiles;
    }


}

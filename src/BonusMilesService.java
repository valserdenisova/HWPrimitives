public class BonusMilesService {
    public int calculate (int price){
        int oneBonus = 20;
        int bonus = price / oneBonus;
        return bonus;
    }
}

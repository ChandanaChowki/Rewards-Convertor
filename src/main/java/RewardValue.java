public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;

    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
//    public static void main(String[] args) {
//        RewardValue rewardValueCash = new RewardValue(100);
//        System.out.println("Cash Value: $" + rewardValueCash.getCashValue() + " is worth " + rewardValueCash.getMilesValue() + " miles");
//
//        RewardValue rewardValueMiles = new RewardValue(28571.42857, true);
//        System.out.println("Miles Value: " + rewardValueMiles.getMilesValue() + " miles is worth $" + rewardValueMiles.getCashValue());
//    }
}

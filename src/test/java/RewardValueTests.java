import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    private static final double MILES_TO_CASH_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * MILES_TO_CASH_RATE;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double expectedMilesValue = cashValue / MILES_TO_CASH_RATE;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(),0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        double expectedCashValue = milesValue * MILES_TO_CASH_RATE;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001);
    }
}
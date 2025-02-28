import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        System.out.println(rewardValue.getCashValue());
        System.out.println(rewardValue.getMilesValue());
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        System.out.println(rewardValue.getCashValue());
        System.out.println(rewardValue.getMilesValue());
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert true;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert true;
    }
}

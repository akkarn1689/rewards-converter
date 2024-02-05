public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    public static double mileToCashConversionRate = 0.0035;

    // constructor to accept cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // constructor to accept miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // function to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // function to get miles value
    public int getMilesValue() {
        return milesValue;
    }

    // function to convert cash to miles
    private int convertCashToMiles(double cash) {
        return (int)(cash / mileToCashConversionRate);
    }

    // function to convert miles to cash
    private double convertMilesToCash(int miles) {
        return miles * mileToCashConversionRate;
    }
}
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // constructor to accept cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // constructor to accept miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // function to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // function to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // function to convert cash to miles
    private double convertCashToMiles(double cash) {
        return cash / 0.0035;
    }

    // function to convert miles to cash
    private double convertMilesToCash(double miles) {
        return miles * 0.0035;
    }
}
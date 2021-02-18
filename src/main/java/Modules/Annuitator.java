package Modules;

public class Annuitator {

    double periods;
    double rate;
    double amount;

    public Annuitator() {
    }

    public Annuitator(double periods, double rate, double amount) {
        this.periods = periods;
        this.rate = rate;
        this.amount = amount;
    }

    public double getPeriods() {
        return periods;
    }

    public void setPeriods(double periods) {
        this.periods = periods;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double annPayment(double p, double r, double amount) {
        return amount * (r / 12 / 100) / (1 - (Math.pow((1 + r / 12 / 100), -p)));
    }


    public double getAmountStnd(double paymentSt, double rateSt, int periodSt) {
        double limit = paymentSt * periodSt/2;
        double distance = -1;

        while (distance < 0) {


            distance = (limit / periodSt) + (limit * rateSt / 1200) - paymentSt;
            System.out.println("Limit" + limit);
            System.out.println("DISTANCE " + distance);
            System.out.println("Init payment " + paymentSt);
            System.out.println("Current payment " + (limit / periodSt) + (limit * rateSt / 1200));
            limit = limit + 10;

        }

        return limit;


    }
}
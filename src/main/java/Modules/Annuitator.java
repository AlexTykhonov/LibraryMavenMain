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

    public double annPayment (double p, double r, double amount) {
        return amount*(r/12/100)/(1-(Math.pow((1+r/12/100),-p)));
    }
}

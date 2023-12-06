package entities;

public class Invoice {
    private double basicPayent;
    private double tax;

    public Invoice() {
    }

    public Invoice(double basicPayent, double tax) {
        this.basicPayent = basicPayent;
        this.tax = tax;
    }

    public double getBasicPayent() {
        return basicPayent;
    }

    public void setBasicPayent(double basicPayent) {
        this.basicPayent = basicPayent;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Double getTotalpayment() {
        return getBasicPayent() - getTax();
    }

}

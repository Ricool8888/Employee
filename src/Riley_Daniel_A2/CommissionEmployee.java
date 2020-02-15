package Riley_Daniel_A2;

/**
 * This class represents a commission employee.
 * @author Riley Khan, Dan Montus
 */
public class CommissionEmployee extends Employee {

    private double rate;
    private double sales;

    /**
     * @param rate Commission rate(double)
     * @param sales Sales rate (double)
     * @param id Employee ID number
     * @param firstName Employee first name
     * @param lastName Employee surname
     */
    public CommissionEmployee(double rate, double sales, int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.rate = rate;
        this.sales = sales;
    }

    /**
     * @return Commission rate getter
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate Commission rate setter
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return Sales rate getter
     */
    public double getSales() {
        return sales;
    }

    /**
     * @param sales Sales rate setter
     */
    public void setSales(double sales) {
        this.sales = sales;
    }

    /**
     * @return Calculated payment amount for a commission employee
     */
    @Override
    public double calculatedPay() {
        return sales * rate / 100;
    }

    @Override
    public String toString() {
        return "Commission Employee " + id + ": " + lastName + ", " + firstName + "\n\tCommission Rate: " + rate + "\n\tSales: $" + sales + "\n";
    }

    @Override
    public String displayInfo() {
        return "Weekly Pay for " + lastName + ", " + firstName + " employee ID: " + id + " is $" + df10.format(calculatedPay());
    }

}

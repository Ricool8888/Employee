package Riley_Daniel_A2;

/**
 * This class represents a hourly employee.
 * @author Riley Khan, Dan Montus
 */
public class HourlyEmployee extends Employee {

    private double numHours;
    private double hourlyRate;

    /**
     * @param numHours Number of hours for employee
     * @param hourlyRate Hourly rate for employee
     * @param id ID number for employee
     * @param firstName Employee first name
     * @param lastName Employee surname
     */
    public HourlyEmployee(double numHours, double hourlyRate, int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.numHours = numHours;
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return Number of hours getter
     */
    public double getNumHours() {
        return numHours;
    }

    /**
     * @param numHours Number of hours setter
     */
    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }

    /**
     * @return Hourly rate getter
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate Hourly rate setter
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return Calculated pay for a hourly employee
     */
    @Override
    public double calculatedPay() {
        return numHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "Hourly Employee " + id + ": " + lastName + ", " + firstName + "\n\tHours: " + numHours + "\n\tRate: $" + hourlyRate + "\n";
    }

    @Override
    public String displayInfo() {
        return "Weekly Pay for " + lastName + ", " + firstName + " employee ID: " + id + " is $" + df10.format(calculatedPay());
    }

}

package assignment2_riley_khan;

/**
 * This class represents an employee paid by the hour.
 * @author Riley Khan
 */
public class HourlyEmployee extends Employee {

    private double numHours;
    private double hourlyRate;

    public HourlyEmployee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public double getNumHours() {
        return numHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    
    
    /**
     * Returns the pay for a hourly employee.
     *  
     */
    @Override
    public double calculatePay(){
        return numHours * hourlyRate;
    }
    
}
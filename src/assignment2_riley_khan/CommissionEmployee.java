package assignment2_riley_khan;

/**
 * This class represents the commission of an employee.
 * @author Riley Khan
 */
public class CommissionEmployee extends Employee {

    private double rate;
    private double sales;

    public CommissionEmployee(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public double getRate() {
        return rate;
    }

    public double getSales() {
        return sales;
    }
    
    
    /**
     * Returns the pay for a commission employee.
     *  
     */
    @Override
    public double calculatePay(){
        return (sales * rate)/100;
    }
    
}
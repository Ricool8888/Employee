package assignment2_riley_khan;

/**
 * This class represents a salaried employee 
 * @author Riley Khan
 */
public class SalaryEmployee extends Employee {

    
    private double salary;

    public SalaryEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    
    /**
     * Returns the pay for a salary employee
     */
    @Override
    public double calculatePay(){
        return salary / 52;
    }
    
}
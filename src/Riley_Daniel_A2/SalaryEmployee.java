package Riley_Daniel_A2;

/**
 * This class represents a salary employee.
 * @author Riley Khan, Dan Montus
 */
public class SalaryEmployee extends Employee {

    private double salary;

    /**
     *
     * @param salary Employee salary
     * @param id Employee ID
     * @param firstName Employee first name
     * @param lastName Employee surname
     */
    public SalaryEmployee(double salary, int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    /**
     * @return Salary amount getter
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary Salary setter
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return Calculated pay for a salary employee.
     */
    @Override
    public double calculatedPay() {
        return salary / 100;
    }

    @Override
    public String toString() {
        return "Salary Employee " + id + ": " + lastName + ", " + firstName + "\n\tSalary: $" + salary + "\n";
    }

    @Override
    public String displayInfo() {
        return "Weekly Pay for " + lastName + ", " + firstName + " employee ID: " + id + " is $" + df10.format(calculatedPay());
        // return System.out.printf("Weekly pay for %s, %s employee ID: %d is $ %.2f", lastName, firstName, calculatedPay());
    }
}

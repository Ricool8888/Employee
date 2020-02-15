package Riley_Daniel_A2;

import java.text.DecimalFormat;

/**
 * This class represents an employee.
 * @author Riley Khan, Dan Montus
 */
public abstract class Employee {

    int id;
    String firstName;
    String lastName;
    DecimalFormat df10 = new DecimalFormat("##.##");

    /**
     * @param id Employee ID
     * @param firstName Employee first name
     * @param lastName Employee surname
     */
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    } 

    /**
     * @return Employee ID
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Employee ID setter
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Employee first name getter
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName First name setter
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Surname of employee getter
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName Surname setter
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Calculated pay (will be overridden)
     */
    public double calculatedPay() {
        return 0.0;
    }

    @Override
    public String toString() {
        return " 10";
    }

    public String displayInfo() {
        return "Weekly Pay for " + lastName + ", " + firstName + "employee ID: " + id + "is $" + calculatedPay() + "\n";
    }

}

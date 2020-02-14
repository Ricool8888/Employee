package assignment2_riley_khan;

/**
 * This class represents an employee.
 * @author Riley Khan
 */
public abstract class Employee {

    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    /**
     * Calculates the pay for an employee.
     *  
     */
    public double calculatePay(){
        return 1;
    }
    
    /**
     * Returns a string representation of an employee.
     */
    
//    @Override
//    public String toString(){
//        //return String.format();
//    }
    
}
package assignment2_riley_khan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main method for the Employee Class. We have used regular
 * expressions in this code from
 * https://www.jrebel.com/blog/java-regular-expressions-cheat-sheet
 *
 * @author Riley Khan
 */
public abstract class Assignment2_Riley_Khan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfEmployees, employeeId, userInput, salary;
        String firstname, lastname;
        double hourlyRate, hoursWorked, rate, sales;

        //Create an ArrayList for Employees
        ArrayList<Employee> employees = new ArrayList<>();

        //Prompt the user to enter the number of employees
        System.out.println("How many employees do you have");

        do {
            try {
                numberOfEmployees = input.nextInt(); // Store the user's input
                if (numberOfEmployees < 1) { // Check to see if the number entered by 
                    //the user is correct
                    throw new IllegalArgumentException();
                } else {
                    break;
                }
            } catch (IllegalArgumentException ex) { // Catch the expection if 
                //the number is wrong
                System.out.println("Please enter a number greater than 0");
            }
        } while (true);

        for (int i = 0; i < numberOfEmployees; i++) { //Loop for entering info about
            //the employees
            System.out.println("Employee data for " + (i + 1) + " of "
                    + numberOfEmployees);
            System.out.println("Choose type of employee to add.");
            System.out.println("1. Salaried");
            System.out.println("2. Hourly");
            System.out.print("3. Commission: ");
            do {

                try {
                    userInput = input.nextInt();
                    if (userInput == 1 || userInput == 2 || userInput == 3) {
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println("Please enter 1, 2, or 3.");
                }
            } while (true);

            switch (userInput) {
                case 1:

                    for (int j = 0; j <= numberOfEmployees; j++) {
                        
                        employeeId = checkId(employees);

                        System.out.print("First name: ");
                        firstname = input.nextLine();

                        System.out.print("Last name: ");
                        lastname = input.nextLine();

                        System.out.print("Salary");
                        salary = input.nextInt();

                        Employee employee = new SalaryEmployee(employeeId, firstname, lastname, salary);

                        employees.add(employee);

                        checkId(employees);
                    }

                case 2:
                    System.out.println("Employee Id: ");
                    employeeId = input.nextInt();

                    System.out.println("First name: ");
                    firstname = input.nextLine();

                    System.out.println("Last name: ");
                    lastname = input.nextLine();

                    System.out.println("Hours worked: ");
                    hoursWorked = input.nextDouble();

                    System.out.println("Hourly rate: ");
                    hourlyRate = input.nextDouble();

                case 3:
                    System.out.println("Employee Id: ");
                    employeeId = input.nextInt();

                    System.out.println("First name: ");
                    firstname = input.nextLine();

                    System.out.println("Last name: ");
                    lastname = input.nextLine();

                    System.out.println("Commission rate: ");
                    rate = input.nextDouble();

                    System.out.println("Sales: ");
                    sales = input.nextDouble();

                default:
                    System.out.println("Please enter 1, 2, or 3.");
            }

            System.out.println("Choose a Report.");
            System.out.println("1. Employee listing");
            System.out.println("2. Payroll listing");
            System.out.print("3. Exit: ");

            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                //Printing the Employee listing (all employee objects)

                case 2:

                    for (int j = 0; j <= numberOfEmployees; j++) {
                        //System.out.println("Weekly pay for " + firstname + ", " + lastname + "employee id " + employeeId + "is "); //+calculatePay() for which type of employee they are);
                    }

                case 3:

                    System.exit(0);

                default:

                    System.out.println("Please enter 1, 2, or 3");

            }

//        ArrayList<Cat> cats = new ArrayList<>();
//        
//        while(true){
//            System.out.println("Enter a name for the cat or press 0 to stop: ");
//            String name = input.nextLine();
//            if(name.equals("0")){
//                break;
//            }
//            cat = new Cat(name);
//            
//            cats.add(cat);
//            
//        }
//        
//        System.out.println("Printing out the cats ArrayList");
//        
//        for (Cat catInList: cats) {
//            System.out.println(catInList);
//        }
        }

    }
public static int checkId(ArrayList<Employee> list){
                    Scanner in = new Scanner(System.in);
                    System.out.println("Please enter a employee id: ");
                    int employeeId = in.nextInt();
                for (Employee e : list) { //For the type Employee go through the list employees 
                            if (employeeId == e.getId()) {
                                System.out.println("That id is already taken: ");
                                employeeId = checkId(list);
                            }
                        }
                return employeeId;
            }

public String displayEmployeeInfo(ArrayList<Employee> employees){ //Display the employee info
    return "String";
    }

public String displayEmployeePayroll(ArrayList<Employee> employees){ //Display the payroll info
    return "String";
    }
}

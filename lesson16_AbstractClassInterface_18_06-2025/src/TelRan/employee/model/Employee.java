package TelRan.employee.model;

import java.util.Objects;

public abstract class Employee {
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected double hours;
    protected static double minWage = 36;


    public Employee(int id,
                    String firstName,
                    String lastName,
                    double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    public int getId() {
        return id;
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Employee.minWage = minWage;
    }

    public abstract double calcSalary();

    @Override
    public String toString() {
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String BLUE = "\u001B[34m";
        final String YELLOW = "\u001B[33m";

        String color;
        String position;

        if (this instanceof Manager) {
            color = GREEN;
            position = "Manager";
        } else if (this instanceof SalesManager) {
            color = YELLOW;
            position = "Sales Manager";
        } else if (this instanceof WageEmployee) {
            color = BLUE;
            position = "Wage Employee";
        } else {
            color = RESET;
            position = "Employee";
        }

        return color + position + RESET + " - " +
                color + "id: " + RESET + id + ", " +
                color + "First Name: " + RESET + firstName + ", " +
                color + "Last Name: " + RESET + lastName + ", " +
                color + "Hours: " + RESET + hours + ", " +
                color + "Salary: " + RESET + calcSalary();
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(hours, employee.hours) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, hours);
    }
}

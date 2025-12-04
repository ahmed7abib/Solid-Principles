package liskovSubstitution.violation;

public class Employee {

    protected String name;
    protected double hoursWorked;

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return  hoursWorked * 3000;
    }
}

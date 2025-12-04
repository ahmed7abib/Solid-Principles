package liskov_substitution.violation;

public class PartTimeEmployee extends Employee {

    @Override
    public double calculateSalary() {
        return hoursWorked * 1000;
    }
}

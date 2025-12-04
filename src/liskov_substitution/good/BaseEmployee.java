package liskov_substitution.good;

public abstract class BaseEmployee {

    private String name;
    private double hoursWorked;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public abstract double calculateSalary();
}

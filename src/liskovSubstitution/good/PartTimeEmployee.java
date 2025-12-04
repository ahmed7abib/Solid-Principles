package liskovSubstitution.good;


public class PartTimeEmployee extends BaseEmployee {

    @Override
    public double calculateSalary() {
        return getHoursWorked() * 1000;
    }
}

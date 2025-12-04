package liskov_substitution.good;


public class FullTimeEmployee extends BaseEmployee {

    @Override
    public double calculateSalary() {
        return getHoursWorked() * 3000;
    }
}

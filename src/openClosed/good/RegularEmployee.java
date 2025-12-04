package openClosed.good;

public class RegularEmployee extends Employee {

    public RegularEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus(int overtime) {
        return ((getSalary() / 30) / 8) * overtime;
    }
}

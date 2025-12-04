package openClosed.good;

public class Head extends Employee {

    public Head(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus(int overtime) {
        return (((getSalary() / 30) / 8) * 2) * overtime;
    }
}

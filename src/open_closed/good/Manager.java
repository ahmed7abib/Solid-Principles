package open_closed.good;

public class Manager extends Employee {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus(int overtime) {
        return (((getSalary() / 30) / 8) * 3) * overtime;
    }
}

package open_closed.good;

public abstract class Employee {

    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateBonus(int overtime);

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

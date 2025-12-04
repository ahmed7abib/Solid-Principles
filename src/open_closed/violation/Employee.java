package open_closed.violation;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private EmployeeType employeeType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public double calculateBonus(double overtime) {

        double hourPrice = (salary / 30) / 8;

        switch (employeeType) {
            case MANAGER -> {
                return (hourPrice * 3) * overtime;
            }

            case HEAD -> {
                return (hourPrice * 2) * overtime;
            }

            default -> {
                return hourPrice * overtime;
            }
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

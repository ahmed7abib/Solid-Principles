package liskov_substitution;

import liskov_substitution.good.BaseEmployee;
import liskov_substitution.violation.Employee;
import liskov_substitution.violation.PartTimeEmployee;

public class LSPProgram {

    public static void main(String[] args) {
        /*
         * Violation Demo
         * Here I assume that employee logic will execute,
         * alien the PartTimeEmployee is will be done.
         */
        Employee employee = new PartTimeEmployee();
        employee.setHoursWorked(55);
        System.out.println(employee.calculateSalary());

        /*
         * Good Demo
         * Here I assume that part-time employee logic will execute,
         *  and this is a right way.
         */
        BaseEmployee baseEmployee = new liskov_substitution.good.PartTimeEmployee();
        baseEmployee.setHoursWorked(55);
        System.out.println(baseEmployee.calculateSalary());
    }
}

package openClosed;

import openClosed.good.Head;
import openClosed.good.Manager;
import openClosed.good.RegularEmployee;

public class OCPProgram {

    public static void main(String[] args) {
        Manager manager = new Manager(1, "Ahmed", 50000);
        Head head = new Head(2, "Mohamed", 30000);
        RegularEmployee regularEmployee = new RegularEmployee(3, "Sami", 10000);

        System.out.println("Manager : " + manager + ", His Bonus: " + (int) manager.calculateBonus(5));
        System.out.println("Head : " + head + ", His Bonus: " + (int) head.calculateBonus(5));
        System.out.println("Regular Emp : " + regularEmployee + ", His Bonus: " + (int) regularEmployee.calculateBonus(5));
    }
}

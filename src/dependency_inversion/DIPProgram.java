package dependency_inversion;

import dependency_inversion.good.Gmail;
import dependency_inversion.good.Hotmail;
import dependency_inversion.violation.Notifications;

public class DIPProgram {

    public static void main(String[] args) {

        System.out.println("------------ VIOLATION EXAMPLE ----------------\n");

        Notifications notifications = new Notifications();
        notifications.senGmailNotification();
        notifications.sendHotmailNotification();

        System.out.println("\n------------ Best Practice EXAMPLE ----------------\n");

        dependency_inversion.good.Notifications notifications1;

        notifications1 = new dependency_inversion.good.Notifications(new Gmail());
        notifications1.sendEmail();

        notifications1 = new dependency_inversion.good.Notifications(new Hotmail());
        notifications1.sendEmail();
    }
}

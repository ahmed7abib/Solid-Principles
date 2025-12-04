package dependencyInversion;

import dependencyInversion.good.Gmail;
import dependencyInversion.good.Hotmail;
import dependencyInversion.violation.Notifications;

public class DIPProgram {

    public static void main(String[] args) {

        System.out.println("------------ VIOLATION EXAMPLE ----------------\n");

        Notifications notifications = new Notifications();
        notifications.senGmailNotification();
        notifications.sendHotmailNotification();

        System.out.println("\n------------ Best Practice EXAMPLE ----------------\n");

        dependencyInversion.good.Notifications notifications1;

        notifications1 = new dependencyInversion.good.Notifications(new Gmail());
        notifications1.sendEmail();

        notifications1 = new dependencyInversion.good.Notifications(new Hotmail());
        notifications1.sendEmail();
    }
}

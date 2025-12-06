package dependencyInversion;

import dependencyInversion.good.Gmail;
import dependencyInversion.good.Hotmail;
import dependencyInversion.violation.EmailSender;

public class DIPProgram {

    public static void main(String[] args) {

        System.out.println("------------ VIOLATION EXAMPLE ----------------\n");

        EmailSender emailSender = new EmailSender();
        emailSender.senGmailNotification();
        emailSender.sendHotmailNotification();

        System.out.println("\n------------ Best Practice EXAMPLE ----------------\n");

        dependencyInversion.good.EmailSender emailSender1;

        emailSender1 = new dependencyInversion.good.EmailSender(new Gmail());
        emailSender1.sendEmail();

        emailSender1 = new dependencyInversion.good.EmailSender(new Hotmail());
        emailSender1.sendEmail();
    }
}

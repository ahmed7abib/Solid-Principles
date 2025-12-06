package dependencyInversion.violation;

public class EmailSender {

    private final Gmail gmail;
    private final Hotmail hotmail;

    public EmailSender() {
        gmail = new Gmail();
        hotmail = new Hotmail();
    }

    public void senGmailNotification() {
        gmail.sendEmail();
    }

    public void sendHotmailNotification() {
        hotmail.sendEmail();
    }
}

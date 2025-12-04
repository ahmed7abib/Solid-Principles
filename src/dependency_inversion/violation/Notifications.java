package dependency_inversion.violation;

public class Notifications {

    private final Gmail gmail;
    private final Hotmail hotmail;

    public Notifications() {
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

package dependencyInversion.good;

public class EmailSender {

    private final IMail iMail;

    public EmailSender(IMail iMail) {
        this.iMail = iMail;
    }

    public void sendEmail() {
        iMail.sendEmail();
    }
}

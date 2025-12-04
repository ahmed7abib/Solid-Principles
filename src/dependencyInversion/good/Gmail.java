package dependencyInversion.good;

public class Gmail implements IMail {

    @Override
    public void sendEmail() {
        System.out.println("Sent email by Gmail.");
    }
}

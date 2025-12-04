package dependencyInversion.good;

public class Hotmail implements IMail {

    @Override
    public void sendEmail() {
        System.out.println("Sent email by Hotmail.");
    }
}

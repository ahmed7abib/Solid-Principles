package singleResponsbility.example_1.violation;

import java.io.File;

public class ReportGenerator {

    public void sendEmail(String msg) {
        System.out.println("Email: " + msg);
    }

    public File generateFile() {
        return new File("my_file");
    }

    public void saveFile(File file) {
        System.out.println("Save File" + file.getAbsolutePath());
    }
}

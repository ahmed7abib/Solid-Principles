package single_responsbility.example_1.good;

import java.io.File;

public class ReportGenerator {

    public File generateReport() {
        return new File("my report");
    }
}

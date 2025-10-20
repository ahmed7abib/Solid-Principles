package single_responsbility.report_example.best_practice;

import java.io.File;

public class FileManager {

    public void saveFile(File file) {
        System.out.println("Save File" + file.getAbsolutePath());
    }
}

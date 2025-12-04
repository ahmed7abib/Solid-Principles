package single_responsbility.example_1.good;

import java.io.File;

public class FileManager {

    public void saveFile(File file) {
        System.out.println("Save File" + file.getAbsolutePath());
    }
}

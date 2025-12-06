package interfaceSegregation;

import interfaceSegregation.good.engine.ReaderEngine;
import interfaceSegregation.good.engine.WriterEngine;
import interfaceSegregation.good.devices.MifareDevice;

import java.util.Arrays;


public class ISPProgram {

    public static void main(String[] args) {
        ReaderEngine readerEngine;
        WriterEngine writerEngine;

        try {
            readerEngine = new ReaderEngine(new MifareDevice().getExecutors());
            byte[] buffer = readerEngine.read();
            System.out.println(Arrays.toString(buffer));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            writerEngine = new WriterEngine(new MifareDevice().getExecutors());
            boolean writeSuccess = writerEngine.write(new byte[]{0x00, 0x22});
            System.out.println(writeSuccess);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
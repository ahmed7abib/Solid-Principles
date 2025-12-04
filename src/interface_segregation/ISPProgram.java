package interface_segregation;

import interface_segregation.good.engine.ReaderEngine;
import interface_segregation.good.engine.WriterEngine;
import interface_segregation.good.devices.MifareDevice;
import interface_segregation.good.devices.SleDevice;

public class ISPProgram {

    public static void main(String[] args) {
        ReaderEngine readerEngine;
        WriterEngine writerEngine;

        try {
            readerEngine = new ReaderEngine(new SleDevice().getExecutors());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            writerEngine = new WriterEngine(new MifareDevice().getExecutors());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        readerEngine.read();
        writerEngine.write(new byte[]{0x00, 0x22});
    }
}
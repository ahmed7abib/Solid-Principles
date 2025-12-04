package interface_segregation;

import interface_segregation.good.engine.ReaderEngine;
import interface_segregation.good.engine.WriterEngine;
import interface_segregation.good.devices.MifareDevice;


public class ISPProgram {

    public static void main(String[] args) {
        ReaderEngine readerEngine;
        WriterEngine writerEngine;

        try {
            readerEngine = new ReaderEngine(new MifareDevice().getExecutors());
            readerEngine.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            writerEngine = new WriterEngine(new MifareDevice().getExecutors());
            writerEngine.write(new byte[]{0x00, 0x22});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
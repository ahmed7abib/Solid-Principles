package interfaceSegregation;

import interfaceSegregation.good.engine.ReaderEngine;
import interfaceSegregation.good.engine.WriterEngine;
import interfaceSegregation.good.devices.MifareDevice;


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
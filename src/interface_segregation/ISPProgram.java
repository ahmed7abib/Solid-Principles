package interface_segregation;

import interface_segregation.good.engine.ReaderEngine;
import interface_segregation.good.engine.WriterEngine;
import interface_segregation.good.executor.devices.MifareDevice;
import interface_segregation.good.executor.devices.SleDevice;

public class ISPProgram {

    public static void main(String[] args) {
        ReaderEngine readerEngine = new ReaderEngine(new SleDevice());
        readerEngine.read();

        WriterEngine writerEngine = new WriterEngine(new MifareDevice());
        writerEngine.write(new byte[]{0x00, 0x22});
    }
}
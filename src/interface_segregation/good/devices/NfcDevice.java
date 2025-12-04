package interface_segregation.good.devices;

import interface_segregation.good.executor.Executors;
import interface_segregation.good.executor.IMemoryReader;
import interface_segregation.good.executor.ISectorReader;

public class NfcDevice implements IMemoryReader, ISectorReader {

    public Executors getCapabilities() {
        return new Executors.Builder()
                .withSectorReader(this)
                .withMemoryReader(this)
                .build();
    }

    @Override
    public byte[] readSectorZero() {
        // This fun have implementation,
        // will read sector zero block and return it as byte array.
        return new byte[]{(byte) 0x90, 0x00};
    }

    @Override
    public byte[] readMemoryBlocks() {
        // This fun have implementation,
        // will read memory block and return it as byte array.
        return new byte[]{(byte) 0x90, 0x00};
    }
}

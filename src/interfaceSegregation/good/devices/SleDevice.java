package interfaceSegregation.good.devices;

import interfaceSegregation.good.executor.Executors;
import interfaceSegregation.good.executor.IMemoryReader;
import interfaceSegregation.good.executor.ISectorReader;

public class SleDevice implements  ISectorReader, IMemoryReader {

    public Executors getExecutors() {
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


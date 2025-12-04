package interface_segregation.good.executor.devices;

import interface_segregation.good.executor.Executors;
import interface_segregation.good.executor.IDeviceExecutor;
import interface_segregation.good.executor.IMemoryReader;
import interface_segregation.good.executor.ISectorReader;

public class SleDevice implements IDeviceExecutor, ISectorReader, IMemoryReader {

    @Override
    public Executors getExecutor() {
        Executors executors = new Executors();
        executors.setISectorReader(this);
        executors.setIMemoryReader(this);
        return executors;
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


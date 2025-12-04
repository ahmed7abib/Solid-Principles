package interface_segregation.good.executor.devices;

import interface_segregation.good.executor.Executors;
import interface_segregation.good.executor.IApduExecutor;
import interface_segregation.good.executor.IDeviceExecutor;
import interface_segregation.good.executor.IMemoryWriter;


public class MifareDevice implements IDeviceExecutor, IApduExecutor, IMemoryWriter {

    @Override
    public Executors getExecutor() {
        Executors executors = new Executors();
        executors.setIApduExecutor(this);
        executors.setIMemoryWriter(this);
        return executors;
    }

    @Override
    public byte[] executeCommand(byte[] command) {
        // This fun have implementation,
        // will execute Command and return result.
        return new byte[]{(byte) 0x90, 0x00};
    }

    @Override
    public boolean writeMemoryBlocks(byte[] buffer) {
        // This fun have implementation,
        // will execute Write operation and return true or false.
        return true;
    }
}

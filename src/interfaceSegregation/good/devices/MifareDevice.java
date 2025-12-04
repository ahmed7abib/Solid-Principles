package interfaceSegregation.good.devices;

import interfaceSegregation.good.executor.Executors;
import interfaceSegregation.good.executor.IApduExecutor;
import interfaceSegregation.good.executor.IMemoryWriter;


public class MifareDevice implements IApduExecutor, IMemoryWriter {

    public Executors getExecutors() {
        return new Executors.Builder()
                .withApduExecutor(this)
                .withMemoryWriter(this)
                .build();
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

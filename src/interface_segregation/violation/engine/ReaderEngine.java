package interface_segregation.violation.engine;

import interface_segregation.violation.executor.IDeviceExecutor;

public class ReaderEngine implements IReader {

    private final IDeviceExecutor iDeviceExecutor;

    public ReaderEngine(IDeviceExecutor iDeviceExecutor) {
        this.iDeviceExecutor = iDeviceExecutor;
    }

    @Override
    public byte[] read() {
        byte[] secZero = iDeviceExecutor.readSectorZero();
        byte[] readBlock = iDeviceExecutor.readMemoryBlocks();

        byte[] finalRes = new byte[0];
        if (secZero == readBlock) {
            finalRes = iDeviceExecutor.executeCommand(secZero);
        }

        return finalRes;
    }
}

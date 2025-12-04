package interface_segregation.good.engine;

import interface_segregation.good.executor.IDeviceExecutor;

public class ReaderEngine implements IReader {

    private final IDeviceExecutor iDeviceExecutor;

    public ReaderEngine(IDeviceExecutor iDeviceExecutor) {
        this.iDeviceExecutor = iDeviceExecutor;
    }

    @Override
    public byte[] read() {
        byte[] secZero = iDeviceExecutor.getExecutor().getiSectorReader().readSectorZero();
        byte[] readBlock = iDeviceExecutor.getExecutor().getiMemoryReader().readMemoryBlocks();

        byte[] finalRes = new byte[0];
        if (secZero == readBlock) {
            finalRes = iDeviceExecutor.getExecutor().getiApduExecutor().executeCommand(secZero);
        }

        return finalRes;
    }
}

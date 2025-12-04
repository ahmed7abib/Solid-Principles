package interface_segregation.good.engine;

import interface_segregation.good.executor.IDeviceExecutor;

public class WriterEngine implements IWriter {

    private final IDeviceExecutor iDeviceExecutor;

    public WriterEngine(IDeviceExecutor iDeviceExecutor) {
        this.iDeviceExecutor = iDeviceExecutor;
    }

    @Override
    public boolean write(byte[] buffer) {
        byte[] result = iDeviceExecutor.getExecutor().getiApduExecutor().executeCommand(buffer);
        return iDeviceExecutor.getExecutor().getiMemoryWriter().writeMemoryBlocks(result);
    }
}

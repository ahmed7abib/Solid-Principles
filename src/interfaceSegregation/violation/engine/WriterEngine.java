package interfaceSegregation.violation.engine;

import interfaceSegregation.violation.executor.IDeviceExecutor;

public class WriterEngine implements IWriter {

    private final IDeviceExecutor iDeviceExecutor;

    public WriterEngine(IDeviceExecutor iDeviceExecutor) {
        this.iDeviceExecutor = iDeviceExecutor;
    }

    @Override
    public boolean write(byte[] buffer) {
        byte[] result = iDeviceExecutor.executeCommand(buffer);
        return iDeviceExecutor.writeMemoryBlocks(result);
    }
}

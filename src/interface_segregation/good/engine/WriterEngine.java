package interface_segregation.good.engine;

import interface_segregation.good.executor.IApduExecutor;
import interface_segregation.good.executor.IDeviceExecutor;
import interface_segregation.good.executor.IMemoryWriter;

public class WriterEngine implements IWriter {

    private final IApduExecutor iApduExecutor;
    private final IMemoryWriter iMemoryWriter;

    public WriterEngine(IDeviceExecutor iDeviceExecutor) throws Exception {
        iApduExecutor = iDeviceExecutor.getExecutor().getiApduExecutor();
        iMemoryWriter = iDeviceExecutor.getExecutor().getiMemoryWriter();

        if (iApduExecutor == null) {
            throw new Exception("WriterEngine not support IApduExecutor");
        }

        if (iMemoryWriter == null) {
            throw new Exception("WriterEngine not support IMemoryWriter");
        }
    }

    @Override
    public boolean write(byte[] buffer) {
        byte[] result = iApduExecutor.executeCommand(buffer);
        return iMemoryWriter.writeMemoryBlocks(result);
    }
}

package interface_segregation.good.engine;

import interface_segregation.good.executor.Executors;
import interface_segregation.good.executor.IApduExecutor;
import interface_segregation.good.executor.IMemoryWriter;

public class WriterEngine implements IWriter {

    private final IApduExecutor iApduExecutor;
    private final IMemoryWriter iMemoryWriter;

    public WriterEngine(Executors executors) throws Exception {

        iApduExecutor = executors.getApduExecutor();
        iMemoryWriter = executors.getMemoryWriter();

        if (iApduExecutor == null) {
            throw new Exception("Cant run apdu command.");
        }

        if (iMemoryWriter == null) {
            throw new Exception("Cant write memory blocks.");
        }
    }

    @Override
    public boolean write(byte[] buffer) {
        byte[] result = iApduExecutor.executeCommand(buffer);
        return iMemoryWriter.writeMemoryBlocks(result);
    }
}

package interfaceSegregation.good.engine;

import interfaceSegregation.good.executor.Executors;
import interfaceSegregation.good.executor.IApduExecutor;
import interfaceSegregation.good.executor.IMemoryReader;
import interfaceSegregation.good.executor.ISectorReader;

public class ReaderEngine implements IReader {

    private final ISectorReader iSectorReader;
    private final IMemoryReader iMemoryReader;
    private final IApduExecutor iApduExecutor;

    public ReaderEngine(Executors executors) throws Exception {

        iSectorReader = executors.getSectorReader();
        iMemoryReader = executors.getMemoryReader();
        iApduExecutor = executors.getApduExecutor();

        if (iSectorReader == null) {
            throw new Exception("Cant read sector zero.");
        }

        if (iMemoryReader == null) {
            throw new Exception("Cant read this block.");
        }

        if (iApduExecutor == null) {
            throw new Exception("Cant run apdu command.");
        }
    }

    @Override
    public byte[] read() {
        byte[] secZero = iSectorReader.readSectorZero();
        byte[] readBlock = iMemoryReader.readMemoryBlocks();

        byte[] finalRes = new byte[0];
        if (secZero == readBlock) {
            finalRes = iApduExecutor.executeCommand(secZero);
        }

        return finalRes;
    }
}

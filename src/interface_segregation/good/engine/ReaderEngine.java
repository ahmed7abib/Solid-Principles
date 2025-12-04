package interface_segregation.good.engine;

import interface_segregation.good.executor.IApduExecutor;
import interface_segregation.good.executor.IDeviceExecutor;
import interface_segregation.good.executor.IMemoryReader;
import interface_segregation.good.executor.ISectorReader;

public class ReaderEngine implements IReader {

    private final ISectorReader iSectorReader;
    private final IMemoryReader iMemoryReader;
    private final IApduExecutor iApduExecutor;

    public ReaderEngine(IDeviceExecutor iDeviceExecutor) throws Exception {

        iSectorReader = iDeviceExecutor.getExecutor().getiSectorReader();
        iMemoryReader = iDeviceExecutor.getExecutor().getiMemoryReader();
        iApduExecutor = iDeviceExecutor.getExecutor().getiApduExecutor();

        if (iSectorReader == null) {
            throw new Exception("ReaderEngine not support ISectorReader");
        }

        if (iMemoryReader == null) {
            throw new Exception("ReaderEngine not support IMemoryReader");
        }

        if (iApduExecutor == null) {
            throw new Exception("ReaderEngine not support IApduExecutor");
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

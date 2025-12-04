package interface_segregation.good.executor;

public class Executors {

    private IApduExecutor iApduExecutor;
    private IMemoryReader iMemoryReader;
    private IMemoryWriter iMemoryWriter;
    private ISectorReader iSectorReader;

    public void setIApduExecutor(IApduExecutor iApduExecutor) {
        this.iApduExecutor = iApduExecutor;
    }

    public void setIMemoryReader(IMemoryReader iMemoryReader) {
        this.iMemoryReader = iMemoryReader;
    }

    public void setIMemoryWriter(IMemoryWriter iMemoryWriter) {
        this.iMemoryWriter = iMemoryWriter;
    }

    public void setISectorReader(ISectorReader iSectorReader) {
        this.iSectorReader = iSectorReader;
    }

    public IApduExecutor getiApduExecutor() {
        return iApduExecutor;
    }

    public IMemoryReader getiMemoryReader() {
        return iMemoryReader;
    }

    public IMemoryWriter getiMemoryWriter() {
        return iMemoryWriter;
    }

    public ISectorReader getiSectorReader() {
        return iSectorReader;
    }
}

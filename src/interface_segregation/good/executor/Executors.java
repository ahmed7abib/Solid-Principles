package interface_segregation.good.executor;


public class Executors {

    private final ISectorReader sectorReader;
    private final IMemoryReader memoryReader;
    private final IMemoryWriter memoryWriter;
    private final IApduExecutor apduExecutor;

    private Executors(Builder builder) {
        this.sectorReader = builder.sectorReader;
        this.memoryReader = builder.memoryReader;
        this.memoryWriter = builder.memoryWriter;
        this.apduExecutor = builder.apduExecutor;
    }

    public ISectorReader getSectorReader() {
        return sectorReader;
    }

    public IMemoryReader getMemoryReader() {
        return memoryReader;
    }

    public IMemoryWriter getMemoryWriter() {
        return memoryWriter;
    }

    public IApduExecutor getApduExecutor() {
        return apduExecutor;
    }

    public static class Builder {
        private ISectorReader sectorReader;
        private IMemoryReader memoryReader;
        private IMemoryWriter memoryWriter;
        private IApduExecutor apduExecutor;

        public Builder withSectorReader(ISectorReader r) {
            this.sectorReader = r;
            return this;
        }

        public Builder withMemoryReader(IMemoryReader r) {
            this.memoryReader = r;
            return this;
        }

        public Builder withMemoryWriter(IMemoryWriter w) {
            this.memoryWriter = w;
            return this;
        }

        public Builder withApduExecutor(IApduExecutor e) {
            this.apduExecutor = e;
            return this;
        }

        public Executors build() {
            return new Executors(this);
        }
    }
}

package interfaceSegregation.violation.executor;

public class MifareDevice implements IDeviceExecutor {

    @Override
    public byte[] readSectorZero() {
        // This fun haven't implementation.
        return null;
    }

    @Override
    public byte[] readMemoryBlocks() {
        // This fun haven't implementation.
        return null;
    }

    @Override
    public byte[] executeCommand(byte[] command) {
        // This fun have implementation,
        // will execute Command and return result.
        return new byte[]{(byte) 0x90, 0x00};
    }

    @Override
    public boolean writeMemoryBlocks(byte[] buffer) {
        // This fun have implementation,
        // will execute Write operation and return true or false.
        return true;
    }
}

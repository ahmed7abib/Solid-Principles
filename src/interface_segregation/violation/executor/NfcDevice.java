package interface_segregation.violation.executor;

public class NfcDevice implements IDeviceExecutor {

    @Override
    public byte[] readSectorZero() {
        // This fun have implementation,
        // will read sector zero block and return it as byte array.
        return new byte[]{(byte) 0x90, 0x00};
    }

    @Override
    public byte[] readMemoryBlocks() {
        // This fun have implementation,
        // will read memory block and return it as byte array.
        return new byte[]{(byte) 0x90, 0x00};
    }

    @Override
    public byte[] executeCommand(byte[] command) {
        // This fun haven't implementation.
        return null;
    }

    @Override
    public boolean writeMemoryBlocks(byte[] buffer) {
        // This fun haven't implementation.
        return false;
    }
}

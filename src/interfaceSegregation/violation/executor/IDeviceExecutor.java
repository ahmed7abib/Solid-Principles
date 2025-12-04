package interfaceSegregation.violation.executor;

public interface IDeviceExecutor {

    byte[] readSectorZero();

    byte[] readMemoryBlocks();

    byte[] executeCommand(byte[] command);

    boolean writeMemoryBlocks(byte[] buffer);
}
package interfaceSegregation.good.executor;

public interface IApduExecutor {
    byte[] executeCommand(byte[] command);
}

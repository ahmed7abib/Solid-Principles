package interface_segregation.good.executor;

public interface IApduExecutor {

    byte[] executeCommand(byte[] command);
}

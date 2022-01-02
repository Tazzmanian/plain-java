import java.lang.ProcessHandle;

public class App {

    // Java 9
    private static void processHandleMethod() {
        ProcessHandle currProcess = ProcessHandle.current();
        ProcessHandle.Info info = currProcess.info();
        System.out.println("PID: " + currProcess.pid());
        System.out.println("Info: " + info);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        processHandleMethod();
    }
}

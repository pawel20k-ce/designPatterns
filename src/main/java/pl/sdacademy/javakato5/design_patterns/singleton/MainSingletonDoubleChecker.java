package pl.sdacademy.javakato5.design_patterns.singleton;

public class MainSingletonDoubleChecker {

    public static void main(String[] args) {
        ConfigurationDoubleChecker instance1 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance1);
        instance1.setAppState("RUNNING");
        instance1.setLogPath("C:/");
        instance1.setLogLevel(LogLevel.DEBUG);
        System.out.println("Instance1 call count: " + instance1.getCallCount());

        ConfigurationDoubleChecker instance2 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance2);
        System.out.println("Instance2 call count: " + instance2.getCallCount());
    }
}

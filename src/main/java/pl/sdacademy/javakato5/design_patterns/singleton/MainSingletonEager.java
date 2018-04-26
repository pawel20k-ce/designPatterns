package pl.sdacademy.javakato5.design_patterns.singleton;

public class MainSingletonEager {

    public static void main(String[] args) {
        ConfigurationEager instance1 = ConfigurationEager.getInstance();
        System.out.println(instance1);
        instance1.setAppState("RUNNING");
        instance1.setLogPath("C:/");
        instance1.setLogLevel(LogLevel.DEBUG);
        System.out.println("Instance1 call count: " + instance1.getCallCount());

        ConfigurationEager instance2 = ConfigurationEager.getInstance();
        System.out.println(instance2);
        System.out.println("Instance2 call count: " + instance2.getCallCount());
    }
}

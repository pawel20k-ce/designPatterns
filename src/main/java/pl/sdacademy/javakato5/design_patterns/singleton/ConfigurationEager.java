package pl.sdacademy.javakato5.design_patterns.singleton;

/**
 * Implementation of Singleton pattern using eager loading.
 * It is based on Java class loading, that causes static field to be loaded only once upon multiple instances of the same class.
 * <p>
 * In case, if there will be a class, that could be loaded multiple times, and it will contain static field, this field would share exactly the same value across multiple objects.
 *
 * Pros:
 *  - simplicity - just one line, no need to bother about concurrency
 * Cons:
 *  - In case, if singleton class would be hard to create (creation operation would be time-consuming), then it will slow down application startup
 */
public class ConfigurationEager {
    /*
    During first loading of this class by class loader, following line would be executed. It will cause that INSTANCE
    field will be initialized with new instance of this configuration class. Because the field is final, it will
    disallow to change value that attached to it.
     */
    private static final ConfigurationEager INSTANCE = new ConfigurationEager();
    /**
     * Enum value that will define, which lowest level of logs should be stored
     */
    private LogLevel logLevel;
    /**
     * Location on hard drive, that will contain created log files
     */
    private String logPath;
    /**
     * Verbal information about current application state
     */
    private String appState;
    /**
     * Count of all invocations of method in this class.
     */
    private long callCount;

    /**
     * Private zero-argument constructor. It will prevent from creating an objects of this class by external code.
     */
    private ConfigurationEager() {
    }

    /**
     * Method that returns the only known instance of configuration class. There is no need to perform any additional operations, as INSTANCE is created during class loading.
     * @return the only instance of {@link ConfigurationEager} class
     */
    public static ConfigurationEager getInstance() {
        INSTANCE.callCount++;
        return INSTANCE;
    }

    // ==================== getters and setters
    public LogLevel getLogLevel() {
        callCount++;
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        callCount++;
        this.logLevel = logLevel;
    }

    public String getLogPath() {
        callCount++;
        return logPath;
    }

    public void setLogPath(String logPath) {
        callCount++;
        this.logPath = logPath;
    }

    public String getAppState() {
        callCount++;
        return appState;
    }

    public void setAppState(String appState) {
        callCount++;
        this.appState = appState;
    }

    public long getCallCount() {
        callCount++;
        return callCount;
    }
}

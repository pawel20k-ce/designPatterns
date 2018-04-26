package pl.sdacademy.javakato5.design_patterns.singleton;

/**
 * Double checker implementation of singleton was broken till Java 1.5. It is creating instance of singleton just before
 * it will be used for the first time. It is postponing the initialization, so application can start faster
 *
 * Pros:
 *  - application is not handicapped on the startup
 *  - instantiated just before use - memory optimisation
 *
 * Cons:
 *  - Harder to implement
 *  - its still an Singleton
 */
public class ConfigurationDoubleChecker {
    /**
     * INSTANCE field is not initialized on the class load, and is not final (it will be instantiated later)
     */
    private static ConfigurationDoubleChecker INSTANCE;
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
    private ConfigurationDoubleChecker() {
    }

    /**
     * Returns the instance of singleton. This method is safe in multithreaded application, thanks to synchronized block.
     * See method comments for details
     * @return the only instance of {@link ConfigurationDoubleChecker}
     */
    public static ConfigurationDoubleChecker getInstance() {
        // if there is no INSTANCE yet, try to create one. This condition will only be true on the beginning. We are
        // not synchronizing whole method, because it will create an overhead for every method call, even when singleton is instantiated.
        if (INSTANCE == null) {
            // synchronized block will make sure, that no other thread is currently executing this block (synchronized one)
            // If any thread is currently executing synchronized block, every other thread will wait just before this
            // block till the one inside will finish processing this block
            synchronized (INSTANCE) {
                // this block can be executed only by one thread at time

                // we are checking once more, if instance was not created in the meantime - other thread could went through
                // first IF check just before current thread created instance of configuration and assigned it with INSTANCE
                if (INSTANCE == null) {
                    INSTANCE = new ConfigurationDoubleChecker();
                }
            }
        }
        // increase call count on singleton instance
        INSTANCE.callCount++;
        // return instantiated singleton
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

package com.behavioral.chain;

public abstract class AbstractLogger {
    public static final Integer DEBUG = 1;
    public static final Integer INFO = 2;
    public static final Integer WARN = 3;
    public static final Integer ERROR = 4;

    protected int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public final void logMessage(int level, String message) {
        if (level >= this.level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}

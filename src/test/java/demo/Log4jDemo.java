package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    /*
     * https://springframework.guru/log4j-2-configuration-using-properties-file
     * /Log4j is a java based logging framework
     * Is simple, flexible, reliable and fast
     * Is configured through a configuration file
     * Log4j.xml OR log4j.properties etc...
     * Log4j - log levels
     * TRACE --> Most detailed information. Expect these to be written to logs only. Since version 1.2.12
     * DEBUG --> Detailed information on the flow through the system. Expect these to be written to logs only. Generally speaking, most lines logged by your application should be written as DEBUG
     * INFO  --> Interesting runtime events (startup/shutdown). Expect these to be immediately visible on a console, so be conservative and keep to a minimum.
     * WARN  --> Use of deprecated APIs, poor use of API, 'almost' errors, other runtime situations that are undesirable or unexpected, but not necessarily "wrong". Expect these to be immediately visible on a status console.
     * ERROR --> Other runtime errors or unexpected conditions. Expect these to be immediately visible on a status console.
     * FATAL --> Severe errors that cause premature termination. Expect these to be immediately visible on a status console.
     * OFF   -->  The highest possible rank and is intended to turn off logging.
     * built-in log levels with increasing order of severity
     * Logger --> will log the information on the console or the file
     * Appender --> Console or File
     * Format --> Is the way log messages are formatted for the console or the file
     * helpful tips
     *
     * You can configure to append or overwrite logs in file
     * You can set logging OFF when not required
     * in case heavy logging is making your runs slower...
     *
     * Log4j  - Configuration File
     * Log4j is configured through a configuration file
     * Configuration files can be written in XML, JSON, YAML, or properties file format
     * Set of key-value pairs
     * Within a configuration you can define three main components:
     * Loggers
     * Appender
     * Layouts
     * Configuring logging via a file has the advantage that logging can be turned on or off without modifying the application that uses Log4j.
     */
    private static final Logger logger = LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {

        // Log4j logging message to console or file
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message!");
        logger.fatal("This is a fatal message!");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

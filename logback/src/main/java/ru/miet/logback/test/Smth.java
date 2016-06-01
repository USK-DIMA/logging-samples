package ru.miet.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smth {
    private static Logger logger = LoggerFactory.getLogger(Smth.class);

    public static void doLog() {
        logger.trace("Trace test from Smth");

        logger.debug("Debug test from Smth");

        logger.info("Info test from Smth");

        logger.warn("Warn test from Smth");

        logger.error("Error test from Smth");
    }
}

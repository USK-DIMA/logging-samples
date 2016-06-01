package ru.miet.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.trace("Trace test");

        logger.debug("Debug test");

        logger.info("Info test");

        logger.warn("Warn test");

        logger.error("Error test");

        logger.fatal("Fatal test");

    }
}

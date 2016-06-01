package ru.miet.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.miet.logback.test.Smth;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.trace("Trace test");

        logger.debug("Debug test");

        logger.info("Info test");

        logger.warn("Warn test");

        logger.error("Error test");

        try {
            Integer.parseInt("anything");
        } catch (NumberFormatException e) {
            logger.error(e.getMessage(), e);
        }

        Smth.doLog();
    }
}

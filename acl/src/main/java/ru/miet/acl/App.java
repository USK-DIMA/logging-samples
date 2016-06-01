package ru.miet.acl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Jdk14Logger;

import java.util.logging.Level;

public class App {
    private static Log logger = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        ((Jdk14Logger)logger).getLogger().setLevel(Level.FINEST);

        logger.trace("Trace test");

        logger.debug("Debug test");

        logger.info("Info test");

        logger.warn("Warn test");

        logger.error("Error test");

        logger.fatal("Fatal test");

    }
}

package ru.miet.jul;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(Thread.currentThread().getContextClassLoader().getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.fine("Fine test");

        logger.finer("Finer test");

        logger.finest("Finest test");

        logger.config("Config test");

        logger.info("Info test");

        logger.severe("Severe test");

        logger.warning("Warning test");

        logger.log(Level.SEVERE, "Another severe test");
    }
}

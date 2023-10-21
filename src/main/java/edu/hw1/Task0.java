package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task0 {
    private final static Logger LOGGER = LogManager.getLogger();

    private Task0() {
    }

    /**
     * Writes "Привет, мир!" using LOGGER.info().
     */
    public static void hello() {
        String hello = new String("Привет, мир!");

        LOGGER.info(hello);
    }
}

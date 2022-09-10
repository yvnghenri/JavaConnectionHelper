package me.henri;

import me.henri.util.ConnectionHelper;
import me.henri.util.Logger;

/**
 * @author yvnghenri#4191
 * @created 9/10/2022 | 6:39 PM
 * Copyright (c) 2022 | yvnghenri#4191
 */

public class Main {

    /**
     * Example
     */
    public static void main(String[] args) {

        //instantiating logger class
        Logger logger = new Logger();

        logger.update("Instantiating ConnectionHelper with given arguments");
        //instantiating class and giving parameters for constructor
        ConnectionHelper connectionHelper = new ConnectionHelper("https://example.com/");

        logger.update("Checking if internet connection is present");

        //getting current time in milliseconds
        long startTime = System.currentTimeMillis();

        connectionHelper.getStatus();

        //getting time again
        long endTime = System.currentTimeMillis();

        logger.update("Printing https response status code");
        System.out.println(connectionHelper.printStatus());

        //giving the time it took to finish the process
        //end of code
        logger.update("Process finished in " + (endTime - startTime) + " milliseconds");
    }
}

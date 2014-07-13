package com.doktuhparadox.cryptjournal.core.option;

import com.doktuhparadox.easel.options.MappedOptionsHandler;

import java.io.File;

/**
 * Created and written with IntelliJ IDEA.
 * Module of: CryptJournal
 * User: brennanforrest
 * Date of creation: 6/28/14, at 8:38 PM.
 */
public class OptionManager {
    private static final File configFile = new File("Options.txt");
	public static final MappedOptionsHandler optionHandler = new MappedOptionsHandler(configFile);

    public static void initialize() {
	    optionHandler.add("theme", "light");
	    optionHandler.add("date_format", "m/d/y");
	    optionHandler.add("time_format", "h:m:s");
	    optionHandler.add("encryption_algorithm", "AES");
	    optionHandler.add("twelve_hour_time", "true");
	    optionHandler.add("cache_passwords", "true");
    }
}

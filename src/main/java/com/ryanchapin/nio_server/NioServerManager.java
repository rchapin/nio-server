package com.ryanchapin.nio_server;

import java.util.List;

/**
 * Manages multiple NioServer instances within the same JVM.
 * 
 * Takes command line arguments directly from the main method, parses
 * configuration data, and instantiates the instances.
 * 
 * @since  2015-01-05
 */
public class NioServerManager {

	/**
	 * Command line arguments passed through from the Main class
	 */
	private String[] args;
	
	/**
	 * Path to the configuration .properties file
	 */
	private String configFile;
	
	/**
	 * List of NioServer instances that have been instantiated
	 */
	private List<NioServer> nioServers;

	// ------------------------------------------------------------------------
	// Accessor/Mutators:
	//

	public String[] getArgs() {
		return args;
	}

	public String getConfigFile() {
		return configFile;
	}

	public List<NioServer> getNioServers() {
		return nioServers;
	}	
	
	// ------------------------------------------------------------------------
	// Constructor
	//
	
	public NioServerManager() {}

	// ------------------------------------------------------------------------
	// Member Methods:
	//

	public void run(String[] args) {
		this.args = args;
		
		// Make sure that we have been passed at least a single argument
		if (args.length != 1) {
			throw new IllegalArgumentException("Zero length args array passed. Ensure that a path to a config file is passed");
		}
		
		configFile = args[0];
		if (configFile == null || configFile.length() == 0) {
			throw new IllegalArgumentException("ConfigFile path was either null or empty.");
		}
	}
	
	private boolean parseConfigs() {	
		return false;
	}
}

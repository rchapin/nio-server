package com.ryanchapin.nio_server;

import java.util.List;

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
	// Constructor
	//
	
	public NioServerManager() {}
	
	public void run(String[] args){
		this.args = args;
	}
	
	private boolean parseConfigs() {	
		return false;
	}
}

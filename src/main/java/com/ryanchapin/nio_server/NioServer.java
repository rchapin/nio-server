package com.ryanchapin.nio_server;

/**
 * 
 * @since 2015-01-04
 *
 */
public class NioServer implements Runnable, Comparable<NioServer> {

	private int portNumber;
	
	// ------------------------------------------------------------------------
	// Accessor/Mutators:
	//
	
	/**
	 * Will return the port number on which the NioServer instance is to listen
	 * been configured
	 * .
	 * @return  the port number on which the server is configured to listen.
	 */
	public int getPortNumber() {
		return portNumber;
	}	

	/**
	 * Returns a boolean indicating whether or not the instance is initialized.
	 * 
	 * @return  boolean value indicating whether or not the instance is initialized.  
	 */
	public boolean isInitialized() {
		return false;
	}
	
	// ------------------------------------------------------------------------
	// Constructor
	//
	
	/**
	 * 
	 * @param portNumber
	 *        The port number to which the NioServer instance will bind and
	 *        listen.
	 */
	public NioServer(int portNumber) {
		this.portNumber = portNumber;
	}



	// ------------------------------------------------------------------------
	// Member Methods:
	//
	
	/**
	 * Requires invocation before attempting to run.  Running after initial
	 * initialization and after invoking run will shutdown the server, closing
	 * all existing client connections and will re-initialize the server.
	 */
	public void init() {
	}
	
	
	public void run() {

	}

	public int compareTo(NioServer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean equals(NioServer other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO
		return 0;
	}
}

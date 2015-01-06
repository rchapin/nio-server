package com.ryanchapin.nio_server;

/**
 * @since    2015-01-04
 */
public interface NioServer extends Runnable, Comparable<NioServer> {

	/**
	 * Requires invocation before attempting to run.  Running after initial
	 * initialization and after invoking run will shutdown the server, closing
	 * all existing client connections and will re-initialize the server.
	 */
	public void init();
	
	/**
	 * Returns a boolean indicating whether or not the instance is initialized.
	 * 
	 * @return  boolean value indicating whether or not the instance is initialized.  
	 */
	public boolean isInitialized();
	
	/**
	 * Will return the port number on which the NioServer instance is to listen
	 * been configured
	 * .
	 * @return  the port number on which the server is configured to listen.
	 */
	public int getPortNumber();
	
	public int compareTo(NioServer o);
	
	public boolean equals(NioServer other);
	
	public int hashCode();
	
}

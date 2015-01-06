package com.ryanchapin.nio_server;

/**
 * @since  2015-01-04
 */
public class Main {

	private static NioServerManager nioServerManager = new NioServerManager();
	
	public static void setNioServerManager(NioServerManager nioServerManager) {
		Main.nioServerManager = nioServerManager;
	}
	
	/**
	 * Entry point for the NioServer program.
	 * 
	 * @param args
	 *        Must include a path, either relative, or fully qualified to a
	 *        valid <code>nio-server.properties</code> file.
	 */
	public static void main(String[] args) {
		nioServerManager.run(args);
	}
}

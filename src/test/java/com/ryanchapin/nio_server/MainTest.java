package com.ryanchapin.nio_server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

public class MainTest {
	
	private static final String CONFIG_PATH = "/tmp/test.properties";
	
	// private JUnit4Mockery mockery = new JUnit4Mockery();

	@Mock
	private NioServerManager mockNioServerManager;
	
	@Before
	public void setUp() {
		mockNioServerManager = Mockito.mock(NioServerManager.class);	
	}
	
	@After
	public void tearDown() {
		mockNioServerManager = null;
	}
	
	/**
	 * Ensures that the {@link Main} class instantiates an instance of
	 * {@link NioServerManager}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void shouldCreateValidNioServerManager() throws Exception {
		// Set up the whenNew expectation to return an instance of the mocked
		// class
		PowerMockito.whenNew(NioServerManager.class)
			.withNoArguments()
			.thenReturn(mockNioServerManager);
		
		// Main.setNioServerManager(mockNioServerManager);
		Main.main(new String[] { CONFIG_PATH });
		
		PowerMockito.verifyNew(NioServerManager.class);
	}
	
	public void shouldCallNioServerManagerWithCorrectArgs() {
		
	}

}

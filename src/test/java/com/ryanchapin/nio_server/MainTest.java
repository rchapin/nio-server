package com.ryanchapin.nio_server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Main.class)
public class MainTest {
	
	private static final String CONFIG_PATH = "/tmp/test.properties";
	private static final String[] ARGS = new String[] { CONFIG_PATH };
	
	@Mock
	private NioServerManager mockNioServerManager;
	
	@Before
	public void setUp() throws Exception {
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
		PowerMockito.whenNew(NioServerManager.class)
			.withNoArguments()
			.thenReturn(mockNioServerManager);
		Main.main(ARGS);
		PowerMockito.verifyNew(NioServerManager.class);
	}
	
	@Test
	public void shouldPassArgsToNioServerManagerWithCorrectArgs() {
		Main.setNioServerManager(mockNioServerManager);
		Main.main(ARGS);
		Mockito.verify(mockNioServerManager).run(ARGS);
	}
}

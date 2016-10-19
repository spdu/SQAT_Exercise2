import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	PlanetExplorer explorer = new PlanetExplorer(0,0,"");

	@Test
	public void test_initializeState() throws PlanetExplorerException {
	assertNotNull(explorer);
	}
	
	@Test
	public void test_explorerFacingNorth() throws PlanetExplorerException {
	//explorer.set(0,0,"");
	assertEquals("N", explorer.getFacing());
	}
	@Test
	public void test_explorerPosition_X_AfterSpawn() throws PlanetExplorerException {
	
	assertEquals(0, explorer.getPositionX());
	}
	@Test
	public void test_explorerPosition_Y_AfterSpawn() throws PlanetExplorerException {
	
	assertEquals(0, explorer.getPositionY());
	}
	
	@Test
	public void test_receiveCommand_left() throws PlanetExplorerException {
	explorer.executeCommand("f");
	assertEquals(1, explorer.getPositionY());
	}
	@Test
	public void test_showAllInformation() throws PlanetExplorerException {
	
	assertEquals("0,0,N", explorer.showInfo());
	}
	
	@Test
	public void test_receiveCommand_left_showInfo() throws PlanetExplorerException {
	explorer.executeCommand("f");
	assertEquals("0,1,N", explorer.showInfo());
	}
	
}

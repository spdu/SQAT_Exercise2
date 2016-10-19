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
	assertEquals("N", explorer.getFacing());
	}
}

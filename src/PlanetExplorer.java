
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:114
// Finish time:

public class PlanetExplorer {
	
	
	private int positionx = 0;
	int positiony = 0;
	String facing ="N";
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	//positionx = x;
	//positiony = y;
	
	}
	public void setPosition(int x, int y, String direction) {
		positionx = x;
		positiony = y;
		setFacing(direction);
	}
	
	public String executeCommand(String command){

			int currPos_X;
			int currPos_Y;
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		for (int i = 0; i < command.length(); i++){
			System.out.println("currPos_X on " + positionx);
			//System.out.println(command.substring(i, i+1));
		if (command.substring(i, i+1) == "f"){
			if (facing == "S") {
				positionx--;
				
			}
			if (facing =="W"){
				positionx++;
			}
			
			if (facing == "N") {
				positiony++;
			}
					

			if (facing == "E") {
				positiony--;
			}
		}
		if (command.substring(i, i+1) == "b"){
			if (facing == "S") {
				positionx++;
				
			}
			if (facing =="W"){
				positionx--;
			}
			
			if (facing == "N") {
				positiony--;
			}
					

			if (facing == "E") {
				positiony++;
			}
		}
		if (command.substring(i, i+1) == "l") {
			setFacing("W");
		}
		if (command.substring(i, i+1) == "r") {
			setFacing("E");
		}
		
		}
		currPos_X = positionx;
		currPos_Y = positiony;
		PlanetExplorer.this.positiony = positiony;
		return (positionx + "," + positiony + "," + getFacing());
		
		

	}
	public String getFacing() {
		return facing;
	}
	public void setFacing(String direction) {
		facing = direction;
	}
	public int getPositionX() {
		
		return positionx;
	}
	public int getPositionY() {
		
		return positiony;
	}

	public String showInfo() {
	
	
	return (positionx + "," + positiony + "," + getFacing());
	}
}

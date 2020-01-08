/**
 * Description: GamePiece class for Homework #1 for CSE 240 - Spring 2019
 * 
 * Completion Time: ~ 2 Hour
 * 
 * Emma Hermick
 * 
 * Version 1.0
 */

public class GamePiece 
{
	//Instance Variables
	private String label;
	static GamePiece defaultLabel;
	
	//Constructs a GamePiece object by assigning the label with the default value "---"
	public GamePiece() {
		GamePiece defaultLabel = new GamePiece("---");
	}
	
	//Constructs a GamePiece object by assigning the label with the newLabel provided
	public GamePiece(String newLabel) {
		String label = new String(newLabel);
	}
	
	//Returns the instance variable label
	public String getLabel() {
		return label;
	}
	
	//Constructs a String of length 3 from the label
	public String toString() {
		
		//If label is shorter than length 3
		if (label.length() <= 3)
		{
			//new String should be the label with spaces appended to make it 
			//correct length
			if (label.length() < 2)
			{
				label = label + "--";
			}
			
			if (label.length() < 1)
			{
				label = label + "---";
			}
		}
			
		//If longer than 3
		if (label.length() > 3)
		{
			//Use the first 3 characters of the label
			label = label.substring(0,3);
		}
		
		
		// TODO implement method
		return label;
	}
}

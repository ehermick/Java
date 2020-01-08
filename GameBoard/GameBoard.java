/**
 * Description: GameBoard class for Homework #1 for CSE 240 - Spring 2019
 * 				Contains 2D array called "board"
 * 
 * Completion Time: ~ 3 Hour
 * 
 * Emma Hermick
 * 
 * Version 1.0
 */

public class GameBoard {
	
	// TODO create instance variables
	private GamePiece[][] board;
	
	public GameBoard(int rows, int cols) 
	{
	
		//Instantiates 2D array "board" to the size rows x cols
		board = new GamePiece[rows][cols];
		
		//Instantiates each GamePiece in "board" using the default constructor
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
				board[r][c] = new GamePiece();
			}
		}
	}
	
	public GamePiece getPiece(int row, int col) {
		// TODO implement method
		
		//Returns a GamePiece at the indexes row and seat (specified by parameters
		//of this method) of the array "board"
		
		
		return board[row][col];
	}
	
	public boolean isSpaceValid(int row, int col) {
		// TODO implement method
		
		//Checks if the parameters row and col are valid
		
		//If one of the parameters "row" or "col" is less than 0
		//or larger than the last index of the array - returns false
		if (row < 0 || col < 0 || row >= board.length || col >= board.length)
		{
			return false;
		}
		
		//NOTE: # of rows and columns can be different
		
		//Otherwise it returns true
		else
		{
			return true;
		}
	}
	
	public boolean addPiece(int row, int col, GamePiece piece) {
		// TODO implement method
		//Validates that the space specified by row and col is valid
		//And that the space is not occupied by a piece
		while (isSpaceValid(row, col) == true)
		{
			//If the GamePiece at the space has a default label, space considered unoccupied
			if ( board[row][col] == GamePiece.defaultLabel)
			{
				//Space is unoccupied
				//If space is valid and not occupied, then space should be replaced by the parameter
				//"piece" and the method should return true
				board[row][col] = piece;
				return true;	
			}
		}

			return false;
		
	}
	
	public boolean movePiece(int srcRow, int srcCol, int destRow, int destCol) {
		// TODO implement method
		
		//Validates that both the src and dest spaces are valid and that the dest space not occupied
		if (isSpaceValid(srcRow, srcCol) == true && isSpaceValid(destRow, destCol) == true 
				&& board[destRow][destCol] == GamePiece.defaultLabel)
		{
			//If both conditions pass, piece located at (srcRow, srcCol) should be moved to 
			//(destRow), (destCol)
			board[destRow][destCol] = board[srcRow][srcCol];
			
			//The space at (srcRow, srcCol) should be replaced by the default GamePiece
			board[srcRow][srcCol] = GamePiece.defaultLabel;
			
			//If this method moves the piece, returns true, otherwise returns false
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public String toString() {
		// TODO implement method
		
		//Returns a String representation of the "board"
		
		//shows the list of pieces placed on the board using the toString method of the 
		//class GamePiece using provided format
		String stringBoard = "The GameBoard" + "\n" + "--------------------" + "\n";
		
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board.length; j++)
			{
				stringBoard += board[i][j].toString();
			}
			
			stringBoard += "\n";
		}
		
		return stringBoard;
	}
}

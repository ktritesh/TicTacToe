import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {
	
	//Constants
	public char PLAYER1;
	public char COMPUTER;
	

	public static void main(String[] args) {
		char[] board = createBoard();
		
	}
	
	/* UC1 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i = 0; i<board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	/* UC2 */
	public static char playerInput() {
		Scanner sc = new Scanner(System.in)
		System.out.println("Enter the letter X or O");
		return sc.next().charAt();
		
	}
	

}
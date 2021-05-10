import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {
	
	static char[] board;

	public static void main(String[] args) {
		char[] board = createBoard();
		Scanner sc = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? '0': 'X';
		
		board = new char[9];
		showBoard();
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
	public static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your Letter: ");
		return userInput.next().toUpperCase().charAt(0);
	}
	
	/* UC3 */
	public static void showBoard() {
		
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");

        System.out.println("|--------------------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");

        System.out.println("|--------------------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}

}
import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {
	
	static char[] board;

	public static void main(String[] args) {
		char[] board = createBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? '0': 'X';
		showBoard(board);
		int userMove = getUserMove(board, userInput);
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
	public static void showBoard(char[] board) {
		
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");

        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");

        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	}
	
	/* UC4 */
	private static int getUserMove(char[] board, Scanner userInput) {
		Integer [] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		while(true) {
			System.out.println("What is your next move? (1-9): ");
			int index = userInput.nextInt();
			if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
				return index;
		}
	}
	private static boolean isSpaceFree(char[] board, int index) {
		return board[index] == ' ';
	}

}
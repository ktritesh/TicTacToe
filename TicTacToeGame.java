import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		char[] board = createBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? '0': 'X';
		
		showBoard(board);
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
		System.out.print("Choose your Letter: ");
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
	public static void moveLocation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("At which position you want to move: ");
		int position = sc.nextInt();
		
		if(board[position]!='X' &&board[position]!='O')
		
	}

}
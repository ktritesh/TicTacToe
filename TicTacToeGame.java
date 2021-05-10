public class TicTacToeGame {
	
	static String[] board;
	
    static void ticTacToeBoard()
    {
        
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        
        System.out.println("|--------------------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        
        System.out.println("|--------------------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
       
    }

	public static void main(String[] args) {
		board = new String[9];
		ticTacToeBoard();

	}

}
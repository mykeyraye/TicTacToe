import java.util.Scanner;

public class TicTacToe {

  private char[][] board;
  private int moves;

  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';

  // Constructor to initialize the board and moves count
  public TicTacToe() {
    board = new char[3][3];
    moves = 0;
    initializeBoard();
  }

  // Initialize the board with empty spaces
  private void initializeBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }
  }

  // Print the current state of the Tic Tac Toe board
  private void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 3; i++) {
      System.out.print("| ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println("\n-------------");
    }
  }

  // Make a move on the board at the specified row and column
  private void makeMove(char symbol, int row, int col) {
    board[row][col] = symbol;
    moves++;
  }

  // Check if the specified player has won the game
  private boolean hasWon(char symbol) {
    for (int i = 0; i < 3; i++) {
      // Check rows and columns
      if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
          (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
        return true;
      }
    }

    // Check diagonals
    return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
           (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
  }

  // Start the Tic Tac Toe game
  public void start() {
    Scanner in = new Scanner(System.in);
    char currentPlayer = PLAYER_X;

    while (moves < 9) {
      printBoard();
      System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]): ");

      int row = in.nextInt() - 1;
      int col = in.nextInt() - 1;

      if (isValidMove(row, col)) {
        makeMove(currentPlayer, row, col);

        if (hasWon(currentPlayer)) {
          printBoard();
          System.out.println("Player " + currentPlayer + " wins!");
          break;
        }

        if (moves == 9) {
          printBoard();
          System.out.println("It's a draw!");
        }

        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
      } else {
        System.out.println("Invalid move! Try again");
      }
    }

    in.close();
  }

  // Check if the move is within bounds and the cell is empty
  private boolean isValidMove(int row, int col) {
    return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
  }

  // Main method to create a TicTacToe object and start the game
  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.start();
  }
}

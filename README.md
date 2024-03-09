**README**

**Description**

This Java code implements a classic Tic-Tac-Toe game for two players. The game features a command-line interface, allowing players to make moves by entering row and column numbers.

**Features**

* **Text-based board:**  A simple grid represents the playing board.
* **Player turns:** The game alternates between players X and O.
* **Win detection:** The code checks for winning combinations (horizontal, vertical, diagonal) after each move.
* **Draw detection:** The game recognizes and declares a draw if the board is full without a winner.

**Code Structure**

The code is organized into a single class named `TicTacToe`:

* **Variables:**
   * `board`:  A 2D character array storing the game state (X, O, or empty).
   * `moves`: A counter to track the total moves played.
   * `PLAYER_X`, `PLAYER_O`: Constants for player symbols.

* **Methods:**
   * `initializeBoard()`: Sets up the board with empty spaces.
   * `printBoard()`: Displays the current board layout.
   * `makeMove(symbol, row, col)`: Updates the board with a player's move.
   * `hasWon(symbol)`: Checks if a given player has won the game.
   * `isValidMove(row, col)`: Determines if a selected move is valid.
   * `start()`: Contains the main game loop, manages player turns, and input.

**How to Run**

1. **Compile:** Save the code as `TicTacToe.java`. Compile it using a Java compiler (e.g., `javac TicTacToe.java`). This will produce a `TicTacToe.class` file.

2. **Execute:** Run the compiled code from your terminal using `java TicTacToe`.

**How to Play**

* When prompted, enter row and column numbers (1-3) for your desired placement.
* The game will continue until a player wins or a draw occurs.

**Example Output**

```
-------------
|   |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
Player X, enter your move (row[1-3] column[1-3]): 
```


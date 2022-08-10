package com.ofs.grade11.classwork;

public class TicTacToeBetter {
    public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
    {
        int rowLength = a.length;    // number of rows
        for (int row = 0; row < rowLength; row++) {
            int columnLength = a[row].length;    // number of columns in a row
            for (int col = 0; col < columnLength; col++) {
                System.out.print(a[row][col]);
                if (col < columnLength - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < rowLength - 1) {
                for (int i = 0; i < columnLength * 2 - 1; i++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static boolean printRow(char[][] board, int row) {
        if (board == null || row < 0 || row >= board.length) {
            return false;
        }

        for (int col = 0; col < board[row].length; col++) // iterates over each column
        {
            System.out.print(board[row][col] + " ");
        }
        System.out.println();
        return true;
    }

    public static void printColumn(char[][] board, int col) {
        if (col < 0) {
            col = col * -1;        // col = Math.abs(col);
        }
        if (col > board.length) {
            col = col % board[0].length;
        }

    }

    public static void newGame(char[][] a, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = ' ';
            }
        }
    }

    public static void Oplays(char[][] a, int size, char player) {
        IBIO.output("Player " + player + " turn:");
        int row = IBIO.inputInt("Row: ");
        while (row < 0 || row > size) {
            row = IBIO.inputInt("Error. Enter row again: ");
        }
        int column = IBIO.inputInt("Column: ");
        while (column < 0 || column > size) {
            column = IBIO.inputInt("Error. Enter column again: ");
        }
        while (a[row - 1][column - 1] != ' ') {
            row = IBIO.inputInt("Space taken, choose a different row: ");
            column = IBIO.inputInt("Space taken, choose a different column: ");
        }
        a[row - 1][column - 1] = player; //if wanna do tictactoe for non compsci then do row-1 and column-1

    }

    public static void Xplays(char[][] a, int size, char player) {
        IBIO.output("Player "+ player + " turn:");
        int row = IBIO.inputInt("Row: ");
        while (row < 0 || row > size) {
            row = IBIO.inputInt("Error. Enter row again: ");
        }
        int column = IBIO.inputInt("Column: ");
        while (column < 0 || column > size) {
            column = IBIO.inputInt("Error. Enter column again: ");
        }
        while (a[row - 1][column - 1] != ' ') {
            row = IBIO.inputInt("Space taken, choose a different row: ");
            column = IBIO.inputInt("Space taken, choose a different column: ");
        }
        a[row - 1][column - 1] = 'X'; //if wanna do tictactoe for non compsci then do row-1 and column-1

    }

    public static boolean BoardNotFull(char[][] a, int size) {
        int count = 0;
        int positionTotal = size * size;
        boolean boardNotFull = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != ' ') {
                    count++;
                }
            }
            if (count == positionTotal) {
                boardNotFull = false;
                return boardNotFull;
            }

        }
        return boardNotFull;
    }

    public static boolean playerOWins(char[][] a, int size, char player) {
        boolean wins = false;

        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (a[i][j] == player) {
                    counter++;
                }
                if (counter == size) {
                    wins = true;
                    return wins;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (a[j][i] == player) {
                    counter++;
                }
                if (counter == size) {
                    wins = true;
                    return wins;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (a[i][i] == player) {
                counter++;
            }
            if (counter == size) {
                wins = true;
                return wins;
            }
        }
        int x = 0;
        int row = 0;
        int column = size-1;
        for (int m = 0; m<size; m++, row++, column--) {
            if(a[row][column]==player){
                x++;
            }
            if (x == size) {
                wins = true;
                return wins;
            }
            /*i++;
            j--;*/
        }
        return wins;
    }

   /* public static boolean playerXWins(char[][] a, int size) {
        boolean xWins = false;

        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (a[i][j] == 'X') {
                    counter++;
                }
                if (counter == size) {
                    xWins = true;
                    return xWins;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (a[j][i] == 'X') {
                    counter++;
                }
                if (counter == size) {
                    xWins = true;
                    return xWins;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (a[i][i] == 'X') {
                counter++;
            }

        }
        int x = 0;
        int i = 0;
        int j = size-1;
        for (int m = 0; m<size; m++) {
            if(a[i][j]=='X'){
                x++;
            }
            if (x == size) {
                xWins = true;
                return xWins;
            }
            i++;
            j--;
        }
        return xWins;
    }
*/
    public static void main(String[] args)
    {	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
        int n = IBIO.inputInt("Input Tic-Tac-Toe board size: ");
        if (n < 3) {
            n = 3;
        }
        char[][] board = new char[n][n];
        newGame(board, n);
        printBoard(board);
        int count = 0;
        int positionTotal = n * n;
        boolean boardNotFull = true;

        while (BoardNotFull(board, n) == true) {
            Oplays(board, n, 'O');
            printBoard(board);
            if (playerOWins(board, n, 'O') == true) {
                IBIO.output("Player O WINS!");
                System.exit(0);
            }
            if (BoardNotFull(board, n) == false) {
                IBIO.output("Game Ended: Tie");
                System.exit(0);
            }
            Oplays(board, n, 'X');
            printBoard(board);
            if(playerOWins(board,n, 'X')==true){
                IBIO.output("Player X Wins!");
                System.exit(0);
            }
            if (BoardNotFull(board, n) == false) {
                IBIO.output("Game Ended: Tie");
                System.exit(0);
            }
        }


        //char[][] board = new char[3][3];
   /*     char[][] board= {	{ '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };

        printBoard(board);
        System.out.println();

        char[][] board2= {	{ '1', '2', '3', '4', '5' },
                { '6', '7', '8', '9', 'A' },
                { 'B', 'C', 'D', 'E', 'F' },
                { 'G', 'H', 'I', 'J', 'K' },
                { 'L', 'M', 'N', 'O', 'P' }
        };

        printBoard(board2);
        System.out.println();

        System.out.println("\nPrinting rows 3 & 9");
        System.out.println( printRow(board2, 3) );
        System.out.println( printRow(board2, 9) );

		System.out.println("\nPrinting columns 5 & 9");
		printColumn(board2, 5);
		printColumn(board2, 9);
*/
    }
}

import java.util.Scanner;

public class TicTacToe1 {

    public static void displayBoard(char[][] matrix) {
        System.out.println("\n-------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] != '\u0000' ? matrix[i][j] + "  |  " : "   |  ");
            }
            System.out.println("\n-------------------");
        }
    }

    public static void getPlayerMove(Scanner scanner, char[][] board, char currentPlayer) {
        boolean done = false;
        do {
            System.out.print("Enter a row (0, 1, 2) for player " + currentPlayer + ": ");
            int row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, 2) for player " + currentPlayer + ": ");
            int column = scanner.nextInt();

            if (board[row][column] == '\u0000') {
                board[row][column] = currentPlayer;
                done = true;
            } else
                System.out.println("This cell is already occupied. Try a different cell");
        }
        while (!done);
    }

    public static boolean checkWin(char[][] matrix, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == currentPlayer && matrix[i][1] == currentPlayer && matrix[i][2] == currentPlayer) {
                return true;
            }
            if (matrix[0][i] == currentPlayer && matrix[1][i] == currentPlayer && matrix[2][i] == currentPlayer) {
                return true;
            }
        }
        if (matrix[0][0] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][2] == currentPlayer) {
            return true;
        }
        if (matrix[0][2] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][0] == currentPlayer) {
            return true;
        }
        return false;

    }
    public static boolean checkDraw(char[][] matrix) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matrix[i][j] == '\u0000') return false;

        return true;
    }


    public static void main(String[] args) {
        char[][] board = new char[3][3];
        displayBoard(board);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            getPlayerMove(scanner, board, 'X');

            displayBoard(board);
            if (checkWin(board, 'X')) {
                System.out.println("X WINS!!");
                System.exit(1);
            } else if (checkDraw(board)) {
                System.out.println("DRAW");
                System.exit(2);
            }

            getPlayerMove(scanner, board, 'O');
            displayBoard(board);

            if (checkWin(board, 'X')) {
                System.out.println("O WINS!!");
                System.exit(3);
            } else if (checkDraw(board)) {
                System.out.println("DRAW");
                System.exit(4);
            }
        }
    }
}


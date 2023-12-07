import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] grid = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        printGrid(grid);
        char currentPlayer = 'X';

        while (true) {
            makeMove(grid, currentPlayer);
            printGrid(grid);

            if (checkGameResult(grid, currentPlayer)) {
                System.out.println(currentPlayer + " wins");
                break;
            } else if (isGridFull(grid)) {
                System.out.println("Draw");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    private static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    private static void makeMove(char[][] grid, char currentPlayer) {
        int row, col;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the coordinates (row col): ");
            try {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }

                if (grid[row][col] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    grid[row][col] = currentPlayer;
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine();
            }
        }
    }
    private static boolean checkGameResult(char[][] grid, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == currentPlayer && grid[i][1] == currentPlayer && grid[i][2] == currentPlayer) ||
                    (grid[0][i] == currentPlayer && grid[1][i] == currentPlayer && grid[2][i] == currentPlayer)) {
                return true;
            }
        }

        if ((grid[0][0] == currentPlayer && grid[1][1] == currentPlayer && grid[2][2] == currentPlayer) ||
                (grid[0][2] == currentPlayer && grid[1][1] == currentPlayer && grid[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }
    private static boolean isGridFull(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

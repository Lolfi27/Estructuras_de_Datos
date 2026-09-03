package Trabajos_clase.Semana_4;

public class Clase_4 {
    static void permutation(String current, String remaining) {

        if (current.length() == 0) {
            System.out.println(current);
        }
        for (int i = 0; i < remaining.length(); i++) {
            char nextChar = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permutation(current + nextChar, newRemaining);
        }
    }

    static int countPermutation(String current, String remaining) {

        if (remaining.length() == 0) {
            return 1;
        }
        int total = 0;
        for (int i = 0; i < remaining.length(); i++) {
            char nextChar = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            total += countPermutation(current + nextChar, newRemaining);
        }
        return total;
    }

    // maze solver
    // S(start) , # (wall) , . (path), T (end), * (visited)

    static char[][] maze = {
            { 'S', '.', '.', '#', '.', '.', '.' },
            { '#', '#', '.', '#', '.', '#', '.' },
            { '.', '.', '.', '.', '.', '#', '.' },
            { '.', '#', '#', '#', '.', '#', '.' },
            { '.', '.', '.', '.', '.', '.', 'T' }
    };

    static boolean validMove(int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length;
    }

    static boolean isWall(int row, int col) {
        return maze[row][col] == '#';
    }

    static boolean[][] visited;
    static int totalCaminos = 0;

    static boolean move(int row, int col, char[][] maze, int index) {
        if (index == maze[0].length) {
            return true;
        }
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false;
        }
        if (visited[row][col]) {
            return false;
        }
        if (maze[row][col] != 'S' && maze[row][col] != 'E' && maze[row][col] != '.') {
            return false;
        }
        visited[row][col] = true;
        maze[row][col] = '*';
        boolean moveRight = move(row, col + 1, maze, index + 1);
        boolean moveLeft = move(row, col - 1, maze, index + 1);
        boolean moveDown = move(row + 1, col, maze, index + 1);
        boolean moveUp = move(row - 1, col, maze, index + 1);
        visited[row][col] = false;
        maze[row][col] = '.';
        return moveRight || moveLeft || moveDown || moveUp;
    }

    static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void showMaze(int row, int col, char[][] maze) {
        if (!validMove(row, col) || visited[row][col] || isWall(row, col)) {
            return;
        }

        // Caso base: se llegó a la salida 'T'
        if (maze[row][col] == 'T') {
            totalCaminos++;
            System.out.println("Camino " + totalCaminos + ":");
            printMaze(maze);
            return;
        }

        visited[row][col] = true;
        char original = maze[row][col];
        if (original == '.') {
            maze[row][col] = '*';
        }

        showMaze(row, col + 1, maze);
        showMaze(row, col - 1, maze);
        showMaze(row + 1, col, maze);
        showMaze(row - 1, col, maze);

        visited[row][col] = false;
        maze[row][col] = original;
    }

    static void mazeSolver() {
        visited = new boolean[maze.length][maze[0].length];
        totalCaminos = 0;
        int startRow = 0, startCol = 0;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }
        showMaze(startRow, startCol, maze);
        if (totalCaminos == 0) {
            System.out.println("No se encontró ningún camino.");
        }
    }

    public static void main(String[] args) {
        // System.out.println(countPermutation("", "ABCD"));
        mazeSolver();
    }
}
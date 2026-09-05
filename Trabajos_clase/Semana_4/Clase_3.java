package Trabajos_clase.Semana_4;

public class Clase_3 {
    static char[][] board = {
            { 'C', 'A', 'S', 'A' },
            { 'X', 'S', 'O', 'L' },
            { 'P', 'A', 'T', 'O' },
            { 'R', 'E', 'D', 'X' }
    };
    static boolean[][] visited;

    static boolean exist(String word) {
        visited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (search(row, col, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean search(int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if (visited[row][col]) {
            return false;
        }
        if (board[row][col] != word.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        boolean found = search(row, col + 1, word, index + 1)
                || search(row, col - 1, word, index + 1)
                || search(row + 1, col, word, index + 1)
                || search(row - 1, col, word, index + 1);
        visited[row][col] = false;
        return found;
    }

    public static void main(String[] args) {
        String word = "CASA";

        boolean found = exists(word);
        System.out.println("La palabra " + word + " existe en el tablero: " + found);
    }

}
package Trabajos_clase.Semana_4;

public class Clase_2 {
    static boolean isEven(int n) {
        if (n == 0) {
            return true;
        }
        return isOdd(n - 1);
    }

    static boolean isOdd(int n) {
        if (n == 0) {
            return false;
        }
        return isEven(n - 1);
    }

    public static void main(String[] args) {

    }
}
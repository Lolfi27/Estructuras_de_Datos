package Actividad_3;

public class Recursividad {
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumaDigitos(n / 10);
    }

    public static int sumaDigitosRepetida(int n) {
        if (n < 10) {
            return n;
        }
        return sumaDigitosRepetida(sumaDigitos(n));
    }

    public static void main(String[] args) {
        System.out.println("La Clave es: " + sumaDigitosRepetida(84729) + " " + sumaDigitosRepetida(56318) + " "
                + sumaDigitosRepetida(92746));

    }

}

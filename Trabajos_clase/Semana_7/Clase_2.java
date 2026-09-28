package Trabajos_clase.semana_7;

public class Clase_2 {

    static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 42, 17, 83, 5, 61, 29, 74, 10 };
        int objetivo = 74;
        int resultado = busquedaBinaria(arr, objetivo);
        System.out.println(resultado);
    }
}
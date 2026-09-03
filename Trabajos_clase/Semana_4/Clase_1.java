package Trabajos_clase.Semana_4;

// public class Clase_1 {
//     static void countdown(int n){
//         if(n == 0)
//             return;

//         System.out.println(n);
//         countdown(n-1);
//     }

public class Clase_1 {

    public static int suma(int n) {
        if (n == 0)
            return 0;

        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        // countdown(5);
        System.out.println(suma(5));

    }

}

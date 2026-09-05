package Trabajos_clase.Semana_4;

// public class Clase_1 {
//     static void countdown(int n){
//         if(n == 0)
//             return;

//         System.out.println(n);
//         countdown(n-1);
//     }

// public class Clase_1 {

//     public static int suma(int n) {
//         if (n == 0)
//             return 0;

//         return n + suma(n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(suma(5));

//     }

// }

// public class Clase_1 {
//     public static int factorial(int n){
//         if (n == 0 || n == 1){
//             return 1;
//         }
//         return n * factorial(n-1);
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }
public class Clase_1 {
    public static int contarDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(contarDigitos(12345));
    }
}
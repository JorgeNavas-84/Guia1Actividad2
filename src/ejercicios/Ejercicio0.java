package ejercicios;

import java.util.Scanner;

public class Ejercicio0 {
    // Método estatico que halla el promedio de dos números
    static double promedio (double a, double b){
        double prom = ( a + b ) / 2;
        return prom;
    }
    // Programa que usa la funcion
    public static void main(String[] args) {
        double a, b;
        double p; // promedio
        Scanner teclado = new Scanner(System.in);
        // solicito datos de entrada
        System.out.print("El primer número: ");
        a = teclado.nextDouble();
        System.out.print("El segundo número: ");
        b = teclado.nextDouble();
        // Hallar el dato de salida
        p= promedio(a, b);
        // Imprimir el promedio
        System.out.println("El promedio es " + p);
    }
}

package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    private static double sueldo;

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Su sueldo mensual es: ");
        double sueldo = teclado.nextDouble();


        System.out.printf("El salario libre es %.2f\n ", sueldo-(sueldo*0.40+sueldo*0.15));
        System.out.printf("El presupuesto para arriendo es %.2f\n ", sueldo*0.40);
        System.out.printf("El presupuesto para comer es %.2f\n ", sueldo*0.15);
    }
}

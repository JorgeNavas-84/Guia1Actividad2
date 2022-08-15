package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    int sillas;
    int gordos;
    int flacos;
    // Método estatico para encontrar la cantidad de buses
    static int buses (int gordo, int flaco, int sillas){
        int sillasNecesarias  = (((gordo*2) + flaco) / sillas);
        return sillasNecesarias;
    }
    // Programa que usa la funcion
    public static void main(String[] args) {
        int sillas, gordo, flaco;
        int buses; // buses a encontrar
        Scanner teclado = new Scanner(System.in);
        // solicito datos de entrada
        System.out.print("Cuantas sillas tiene cada bus?: ");
        sillas = teclado.nextInt();
        System.out.print("Cuantos Gordos?: ");
        gordo = teclado.nextInt();
        System.out.print("Cuantos Flacos?: ");
        flaco = teclado.nextInt();
        // Hallar el dato de salida
        buses= buses(sillas,gordo,flaco);
        // Imprimir el promedio
        System.out.println("Se necesitan " + buses + " buses");
    }

}

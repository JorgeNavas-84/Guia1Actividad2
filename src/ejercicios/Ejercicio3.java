package ejercicios;

import java.util.Scanner;

import static java.lang.Math.*;

public class Ejercicio3 {
    double x;
    double alphaSinus;
    double alpha;

    public double obtenerHipotenusa() {
        double y = x/alphaSinus;
        double alphaSinus = (sin(alpha));
        return y;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("El valor de x es: ");
        double x = teclado.nextDouble();
        System.out.print("El valor del angulo en radianes: ");
        double alpha = teclado.nextDouble();

        Ejercicio3 escalera = new Ejercicio3();
        double y = escalera.obtenerHipotenusa();
        System.out.printf("El tamaño de la escalera es %.2f\n ", y);
    }


}

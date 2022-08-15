package ejercicios;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Ejercicio1 {
    // Método estatico que encuentra el valor de la función algebraica f(x,y)= X^2 + 2xy + y^2
    static void calcularRaices (int a, int b, int c){
        // Comparar el valor de a si es 0 la función no es cuadratica
        if (a==0)
        {
            System.out.println("El valor no puede ser 0");
            return;
        }
        // Calcular el discriminante d
        int d = b * b -4 * a * c;
        double valorRaiz = sqrt(abs (d));
        if (d > 0)
        {
            System.out.println("Las raíces de la ecuación son reales y diferentes. \n");
            System.out.println((double)(-b + valorRaiz) / (2 * a) + "\n"+ (double)(-b - valorRaiz) / (2 * a));
        }
        else if (d == 0)
        {
            System.out.println("Las raíces de la ecuación son reales e iguales. \n");
            System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
        }
        // En caso de que d < 0
        else
        {
            System.out.println("Las raíces de la ecuación son complejas y diferentes. \n");
            System.out.println(-(double)b / (2 * a) + " + i"+ valorRaiz + "\n"+ -(double)b / (2 * a)+ " - i" + valorRaiz);
        }
    }
    // Programa que usa la funcion
    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;
        calcularRaices(a,b,c); // Calcular las raices

    }
}

package ejercicios;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Ejercicio5 {
    //Atributo
    private double radio;
    //Constructor
    public Ejercicio5(double radio) {
        this.radio = radio;
    }
    //Getter
    public double obtenerRadio() {
        return radio;
    }
    public double obtenerArea() {
        double area = PI * pow(radio, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("El radio del círculo grande: ");
        double x = teclado.nextDouble();
        System.out.print("El radio del círculo pequeño: ");
        double r = teclado.nextDouble();

        Ejercicio5 verde = new Ejercicio5(x);
        Ejercicio5 blanco = new Ejercicio5(r);
        double areaCorona = verde.obtenerArea() - blanco.obtenerArea();
        System.out.printf("El area de la corona es %.2f\n ", areaCorona);
    }

}

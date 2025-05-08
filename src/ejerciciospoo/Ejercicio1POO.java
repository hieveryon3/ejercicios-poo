package ejerciciospoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1POO {
    /*
    1. Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
        cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
        ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
        notas se debe mostrar la nota más alta y el promedio de notas.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> notasMayores = new ArrayList<>();
        ArrayList<Double> notasMenores = new ArrayList<>();

        System.out.println("Ingrese la cantidad de notas:");
        int cantidadNotas = teclado.nextInt();

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingrese una nota:");
            double nota = teclado.nextDouble();

            notas.add(nota);
            if (nota >= 6) {
                notasMayores.add(nota);
            } else {
                notasMenores.add(nota);
            }
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.size();
        System.out.println("El promedio es: " + promedio);
        System.out.println("Las notas mayores o iguales a 6 son: " + notasMayores);
        System.out.println("Las notas menores a 6 son: " + notasMenores);
    }
}
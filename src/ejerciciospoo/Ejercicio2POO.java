
package ejerciciospoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2POO {
    /*
    2. Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
    iguales a 6), la cantidad de desaprobados (Notas menores a 6).
    */
    public static void main(String[] args) {
          //creamos el array con las notas
    
        double [] notas = {4.2, 5.7, 8, 10, 3};
        ArrayList<Double> notasMayores = new ArrayList<>();
        ArrayList<Double> notasMenores = new ArrayList<>();
        
        for(double nota : notas){
            if(nota>=6){
                notasMayores.add(nota);
            } else{
                notasMenores.add(nota);
            }
        }
        
        String notasString = Arrays.toString(notas); //parseamos el array notas a string para poder mostrarlo
        String notasMString = Arrays.toString(notasMayores.toArray()); //parseamos el array notas a string para poder mostrarlo
        String notasMenString = Arrays.toString(notasMenores.toArray()); //parseamos el array notas a string para poder mostrarlo
        
        
        System.out.println("Las notas son: " + notasString);
        System.out.println("Las notas menores o iguales a 6 son: " + notasMenString);
        System.out.println("Las notas mayores a 6 son: " + notasMString);
    }
}

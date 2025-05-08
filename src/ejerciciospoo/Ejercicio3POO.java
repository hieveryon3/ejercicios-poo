package ejerciciospoo;
import java.util.Arrays;

public class Ejercicio3POO {
    
    /*
    3. Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
        costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.
    */
        public static void main(String[] args) {
        int[] cantProductos = {1, 2, 3, 4};
        int[] costosProductos = {600, 950, 1100, 2500};

        int[] precioTotal = new int[costosProductos.length];
        int contador = 0;

        for (int i = 0; i < cantProductos.length; i++) {
            precioTotal[i] = cantProductos[i] * costosProductos[i];
            
            if (precioTotal[i] > 1000) {
                contador++;
                System.out.println("Producto " + (i + 1) + " supera los $1000: $" + precioTotal[i]);
            }
        }

        System.out.println("Precios totales: " + Arrays.toString(precioTotal));
        System.out.println("Cantidad de productos con precio total > $1000: " + contador);
     }
 }     

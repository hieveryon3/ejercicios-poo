
package ejerciciospoo;

import java.util.Scanner;


public class Ejercicio6POO {
    /*
    6. En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
    cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
    el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
    participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
    pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
      System.out.println("Ingrese el numero del vehículo 1: ");
      int mejorVehiculo = teclado.nextInt();
      
      System.out.println("Ingrese el tiempo del vehículo en segundos: ");
      double mejorTiempo = teclado.nextDouble();
      
      for(int i = 1; i < 12; i++){
       
          System.out.println("Ingrese el numero del vehículo " + (i+1)+": ");
          int vehiculoAuxiliar = teclado.nextInt();
          
          System.out.println("Ingrese el tiempo del vehículo en segundos: ");
          double tiempoAuxiliar = teclado.nextDouble();
          
          if(tiempoAuxiliar < mejorTiempo){
              mejorVehiculo = vehiculoAuxiliar;
              mejorTiempo = tiempoAuxiliar;
          }
      }
        System.out.println("El vehículo " + mejorVehiculo + " completó la carrera en el menor tiempo: " + mejorTiempo);
        }
    }
    



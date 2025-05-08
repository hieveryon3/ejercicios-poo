
package ejerciciospoo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7POO {
    
    /*
    7. Se realizó un censo provincial y se desea procesar la información obtenida en dicho
    censo. De cada una de las personas censadas se tiene la siguiente información: número de
    documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
    censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
    informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
    porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
    mostrar datos de la persona que registra la mayor edad.
    */
    
    public static void main(String[] args) {
         //creamos el arraylist
            ArrayList <Persona> personas = new ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            
            while(true){
                System.out.println("Ingrese el DNI (0 para terminar): ");
                String dni = teclado.nextLine();
                if (dni.equals("0")){
                    break;
                }
                System.out.println("");
                System.out.println("Ingrese la edad: ");
                int edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("");
                System.out.println("Ingrese el sexo (F/M): ");
                String sexo = teclado.nextLine();
                
                Persona persona = new Persona (dni, edad, sexo);
                personas.add(persona);
            }
    }
    
    public static class Persona{
        String dni;
        int edad;
        String sexo;
        
        public Persona(String dni, int edad, String sexo){
            this.dni = dni;
            this.edad = edad;
            this.sexo = sexo;
        }
        
        public String getDni(){
            return this.dni;
        }
        
        public int getEdad(){
            return this.edad;
        }
        
        public String getSexo(){
            return this.sexo;
        }
    }
}

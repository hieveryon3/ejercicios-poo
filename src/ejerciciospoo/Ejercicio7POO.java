
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
            
            int cantPersonas = 0;
            int cantVarones = 0;
            int cantMujeres = 0;
            double rangoEdades = 0;
            int mayorEdad = 0;
            
            
            while(true){
                System.out.println("Ingrese el DNI (0 para terminar): ");
                String dni = teclado.nextLine();
                if(dni.equals("0")){
                    break;
                }
                System.out.println("");
                System.out.println("Ingrese la edad: ");
                int edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("");
                System.out.println("Ingrese el sexo (F/M): ");
                String sexo = teclado.nextLine();
                if(sexo.equals("M")){
                    cantVarones++;
                    if(edad >= 16 && edad <= 65){
                        rangoEdades++;
                    }
                } else {
                    cantMujeres++;
}
                System.out.println("");
                
                Persona persona = new Persona (dni, edad, sexo);
                personas.add(persona);
                
                cantPersonas += 1;
                
                if(edad > mayorEdad){
                    mayorEdad = edad; 
                }
            }
            
            double porcentajeVarones = (rangoEdades / cantVarones) * 100;
            
            System.out.println("---------------INFORME---------------");
            System.out.println("");
            
            System.out.println("Las personas censadas fueron: " + cantPersonas);
            System.out.println("La cantidad de varones fueron: " + cantVarones);
            System.out.println("La cantidad de mujeres fueron: " + cantMujeres);
            System.out.println("El porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones es: " + porcentajeVarones + "%");
            System.out.println("");
            
            for (Persona persona : personas){
                if(persona.getEdad() == mayorEdad){
                    System.out.println("El DNI de la persona con mayor edad es: " + persona.getDni());
                    System.out.println("La edad de la persona con mayor edad es: " + persona.getEdad());
                    System.out.println("El sexo de la persona con mayor edad es: " + persona.getSexo());
                    break;
                }
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
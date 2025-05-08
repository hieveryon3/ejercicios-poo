
package ejerciciospoo;

import java.util.Scanner;


public class Ejercicio5POO {
/*
5. Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa.
    Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y tipo de servicio.Los tipos de servicio son 3: 1. Internet 30 megas (El servicio cuesta: $750)
    2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El servicio cuesta: $1500 – menos 5% de descuento por promoción)
    El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente)
    e informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio con el que cuenta. 
*/
 static class Servicio{
        
        private String dni;
        private String tipo;
        private double costo;
        private double descuento;
        
        public Servicio(String dni, String tipo, double costo, double descuento){
            this.dni = dni;
            this.tipo = tipo;
            this.costo = costo;  
            this.descuento = descuento;
        }
        
        public double montoTotal(){
            double descuentoDecimal = this.descuento / 100; 
            return this.costo - (descuentoDecimal * this.costo);
        }
        
         public String getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }
    }
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        Servicio [] clientes = new Servicio[5];  
        
        for(int i = 0; i<5; i++){
     
            System.out.println("Cliente: " + (i+1));
            
            System.out.println("Ingrese su DNI: ");
            String id = teclado.nextLine();
            System.out.println("");
            System.out.println("Seleccione el tipo de servicio:");
            System.out.println("1 - Internet 30 megas ($750)");
            System.out.println("2 - Internet 50 megas ($1100)");
            System.out.println("3 - Internet 100 megas ($1500 con 5% descuento)");
            
            System.out.print("Opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");
            String serv = "";
            double costo = 0;
            double descuento = 0;
            
            
            switch (opcion){
                case 1:
                    serv = "Internet 30 megas";
                    costo = 750;
                    break;
                case 2:
                    serv = "Internet 50 megas";
                    costo = 1100;
                    break;
                case 3:
                    serv = "Internet 100 megas";
                    costo = 1500;
                    descuento = 5;
                    break;
                default:
                    System.out.println("Opción inválida. El programa se cerrará");
                    System.exit(0);
          }
            clientes[i] = new Servicio(id, serv, costo, descuento);
       }
        
         System.out.println("\n--- Facturación de clientes ---");
         
         for(Servicio cliente: clientes){
             System.out.println("Cliente DNI: " + cliente.getDni());
            System.out.println("Servicio contratado: " + cliente.getTipo());
            System.out.println("Monto a pagar: $" + cliente.montoTotal());
            System.out.println();
         }
    }
}
 
    
    
    
    
    
    
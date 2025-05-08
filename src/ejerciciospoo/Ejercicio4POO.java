package ejerciciospoo;

import java.util.Scanner;

public class Ejercicio4POO {

    static class Camion {
        private String patente;
        private String nombreChofer;
        private String apellidoChofer;
        private String carga;
        private String horaEgreso;

        public Camion() {
            this.patente = "";
            this.nombreChofer = "";
            this.apellidoChofer = "";
            this.carga = "";
            this.horaEgreso = "";
        }

        public String getPatente() { return patente; }
        public void setPatente(String patente) { this.patente = patente; }

        public String getChofer() { return nombreChofer; }
        public void setChofer(String chofer) { this.nombreChofer = chofer; }

        public String getApellido() { return apellidoChofer; }
        public void setApellido(String apellido) { this.apellidoChofer = apellido; }

        public String getCarga() { return carga; }
        public void setCarga(String carga) { this.carga = carga; }

        public String getHoraEgreso() { return horaEgreso; }
        public void setHoraEgreso(String hora) { this.horaEgreso = hora; }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Camion[] camiones = new Camion[30];
        int contadorTe = 0;

        for (int i = 0; i < 30; i++) {
            camiones[i] = new Camion();

            System.out.println("Camión " + (i + 1));
            System.out.print("Ingrese la patente: ");
            camiones[i].setPatente(teclado.nextLine());

            System.out.print("Ingrese el nombre del chofer: ");
            camiones[i].setChofer(teclado.nextLine());

            System.out.print("Ingrese el apellido del chofer: ");
            camiones[i].setApellido(teclado.nextLine());

            System.out.print("Ingrese el tipo de carga (madera, yerba o té): ");
            camiones[i].setCarga(teclado.nextLine());

            System.out.print("Ingrese la hora de egreso: ");
            camiones[i].setHoraEgreso(teclado.nextLine());

            if (camiones[i].getCarga().equalsIgnoreCase("té")) {
                contadorTe++;
            }

            System.out.println(); // Espacio entre cada camión
        }

        System.out.println("\n----- DATOS DE LOS CAMIONES -----");
        for (int i = 0; i < 30; i++) {
            System.out.println("Camión " + (i + 1));
            System.out.println("Patente: " + camiones[i].getPatente());
            System.out.println("Nombre del chofer: " + camiones[i].getChofer());
            System.out.println("Apellido del chofer: " + camiones[i].getApellido());
            System.out.println("Carga: " + camiones[i].getCarga());
            System.out.println("Hora de egreso: " + camiones[i].getHoraEgreso());
            System.out.println();
        }

        System.out.println("Cantidad de camiones que cargaron té: " + contadorTe);
    }
}
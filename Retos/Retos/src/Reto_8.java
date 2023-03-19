import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombre;
        int edad = 0;
        int numDocumento;
        int decision = 0;
        boolean registrado = false; // Variable para verificar si el aprendiz está registrado o no

        System.out.println("Bienvenido al registro de auxilios");

        do {
            System.out.print("Ingrese el nombre del aprendiz: ");
            nombre = lectura.nextLine();

            if (registrado) { // Si el aprendiz ya está registrado, no puede registrar otro auxilio
                System.out.println("El aprendiz " + nombre + " ya está registrado en un auxilio");
            } else {
                System.out.print("Ingrese su edad: ");
                edad = lectura.nextInt();
                lectura.nextLine();

                System.out.print("Ingrese su número de documento: ");
                numDocumento = lectura.nextInt();

                System.out.println("Seleccione el auxilio que desea asignar al aprendiz:" + nombre);
                System.out.println("1. Auxilio de transporte");
                System.out.println("2. Apoyo de sostenimiento");
                System.out.println("3. Auxilio de alimentacion");
                int opcion = lectura.nextInt();

                registrado = true; // El aprendiz está registrado al auxilio seleccionado
                System.out.println("El aprendiz " + nombre + " está registrado en el auxilio " + opcion);
            }

            System.out.println("¿Desea agregar otro auxilio? (0 para Si, 1 para No)");
            decision = lectura.nextInt();
            lectura.nextLine(); // Consumimos el salto de línea para evitar errores en la siguiente iteración

        } while (decision == 0);

        lectura.close();
    }
}
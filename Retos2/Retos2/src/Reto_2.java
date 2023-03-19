import java.util.Scanner;
public class Reto_2 {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

        int cantidad_competidores;
        int ganador=0;
        String nombre;
        Float tiempo;

        System.out.print("Ingrese la cantidad de competidores: ");
        cantidad_competidores = lectura.nextInt();

        // guardar los datos que se solicitan como el nombre y el tiempo del competidor
        String[] nombres = new String[cantidad_competidores];
        double[] tiempos = new double[cantidad_competidores];

        for (int competidor = 0; competidor < cantidad_competidores; competidor++) {
            System.out.print("Ingrese el nombre del competidor " + (competidor+1) + ": ");
            nombre = lectura.next();
            nombres[competidor] = nombre;

            System.out.print("Ingrese el tiempo del competidor en segundos " + (competidor+1) + ": ");
            tiempo = lectura.nextFloat();
            tiempos[competidor] = tiempo;
        }
        System.out.println("los competidores y sus tiempos son: ");
        for (int competidor = 0; competidor < cantidad_competidores; competidor++) {
            System.out.println(nombres[competidor] + ": " + tiempos[competidor]);
        }
        for (int competidor = 1; competidor < cantidad_competidores; competidor++) {
            if (tiempos[competidor] < tiempos[ganador]) {
                ganador = competidor ;
            }
        }

        System.out.println("El ganador es: " + nombres[ganador] + " con un tiempo de " + tiempos[ganador]);

        lectura.close();

}
}

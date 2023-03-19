import java.util.Scanner;
import java.util.Random;

public class Reto_4 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        int apuesta, figura;

        System.out.print("Ingrese la cantidad a apostar: ");
        apuesta = lectura.nextInt();
        System.out.print("¿Cual figura desea escojer? (0 para piedra, 1 para papel , 2 para tijera ): ");
        figura = lectura.nextInt();

        int resultado = random.nextInt(3);

        if (figura == resultado) {
            System.out.println("Usted ganó ");
            apuesta *= 2;
        } 
        else if (figura == resultado) {
            System.out.println("Usted perdió ");
            apuesta = 0;
        }
        else {
            System.out.println("Empate, nadie gana. ");
            apuesta *= 1;
        }
        
        System.out.println("Monto acutal: " + apuesta);
        lectura.close();
    }
}

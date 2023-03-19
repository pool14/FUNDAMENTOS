import java.util.Scanner;
import java.util.Random;

public class Reto_7 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    Random random = new Random();

int vidas=3;
int decision=0;
int cantidad;
int apuestainicial;
int figura;
int resultado;


System.out.print("Ingrese la cantidad a apostar: ");
cantidad = lectura.nextInt();

for (int h=0; h==decision;h++) {
for (int i=0; i<vidas ;i--) {

    System.out.println("Cuanto deseas apostar");
    apuestainicial=lectura.nextInt(); 

    System.out.print("¿Cual figura desea escojer? (0 para piedra, 1 para papel , 2 para tijera ): ");
    figura = lectura.nextInt();

    resultado = random.nextInt(3);

    if (figura == resultado) {
        System.out.println("Usted ganó ");
        System.out.println(" Su dinero es " + (cantidad + apuestainicial )+ "$");
        cantidad += apuestainicial;

    } else if (figura == resultado) {

        System.out.println("Usted perdió tiene " + (vidas-1)); 
        System.out.println(" Su dinero es " + (cantidad - apuestainicial )+ "$");
        cantidad += apuestainicial;
        vidas--;
    }

    else {
    System.out.println("Empate, nadie gana. ");
    cantidad *= 1;
    System.out.println("Monto acutal: " + cantidad);


        if (vidas==0) {
            System.out.println("Usted no tiene mas vidas, HA PERDIDO");
            System.out.println("Quiere volver a jugar? 0 si 1 no");
            decision=lectura.nextInt();
            vidas+=3;
        }

        else if (cantidad==0) {
            System.out.println("Usted no tiene dinero, HA PERDIDO");
            System.out.println("Quiere volver a jugar? 0 si 1 no");
            decision=lectura.nextInt();
        }
       
    }
}
    }
    lectura.close();

    }
}


    
    
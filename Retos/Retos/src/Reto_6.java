import java.util.Scanner;
import java.util.Random;
public class Reto_6 {

    public static void main(String args[]) {
    
    Scanner lectura =new Scanner(System.in);
    

    int jugador, computadora ;
    int vidas=3;
    int contador=3;
    int apuesta=0;
    int apuesta2=0;
    int apuestainicial;
    int decision=0;
    
    
    System.out.println("ingrese el dinero que quiere apostar");
    apuesta = lectura.nextInt();
    
   
    
        while (contador >0)
        {
         System.out.println("ingrese que parte de la moneda quiere elegir: 0 cara 1 sello");
         jugador = lectura.nextInt();

         System.out.println("Tu saldo es: " + apuesta + " y tus vidas son:" + vidas);   
         System.out.println("Cuanto deseas apostar");
         apuestainicial=lectura.nextInt(); 

         if (apuestainicial > apuesta) {
         System.out.println("No tienes suficiente dinero para hacer una apuesta");
         break;
         }

         Random random=new Random();
         computadora=random.nextInt(2);
        
         if(jugador==computadora)
         {
         System.out.println("Usted ha ganado");
         apuesta += apuestainicial ;
         System.out.println(" Su dinero es " + (apuesta2 + apuesta )+ "$");

        } else {
        vidas--;
        System.out.println("gana la computadora"); 
        apuesta -= apuestainicial ;
        System.out.println(" Su dinero es " + (apuesta )+ "$");
        System.out.println("Ha perdido una vida, le quedan "+vidas+"vida(s)");
} 

if (vidas==0) {
    System.out.println("Usted no tiene mas vidas, HA PERDIDO");
    System.out.println("Quiere volver a jugar? 0 si 1 no");
    decision=lectura.nextInt();
    vidas+=3;
    System.out.println("ingrese el dinero que quiere apostar");
    apuesta = lectura.nextInt();
}
else if (apuesta==0) {
System.out.println("Usted no tiene dinero, HA PERDIDO");
}
contador ++;
    }
    System.out.println(" usted jugo " + contador +  " veces y su dinero es " + apuesta);
    lectura.close();
}
}
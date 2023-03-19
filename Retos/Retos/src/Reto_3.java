import java.util.Scanner;
import java.util.Random;
public class Reto_3 {
    


public static void main(String args[]) {

     
Scanner lectura =new Scanner(System.in);


int jugador, computadora,apusta;

System.out.println("elija la cantidad de dinero que quiere apostar"); 
apusta = lectura.nextInt();        

System.out.println("ingrese que parte de la moneda quiere elegir: 0 cara 1 sello"); 
jugador = lectura.nextInt();
    
Random random=new Random();
computadora=random.nextInt(2);

if(jugador==computadora)
{
System.out.print("Usted ha ganado");
apusta += 2;
} else {
System.out.print("gana la computadora"); 
apusta = 0;
}    
System.out.println(" SU DINERO ES " + apusta); 
lectura.close();
   
 }

}
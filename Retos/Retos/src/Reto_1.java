import java.util.Scanner;
public class Reto_1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
         System.out.println("ingrese grados centigrados para convertir a grados kelvin");
         int gradosCen = lectura.nextInt();

         System.out.println("ingrese numero de personas que van a comer torta");
         int personasNum = lectura.nextInt();

         System.out.println(gradosCen + "grados °C es igual " + (gradosCen + 273.15));
        
         float harinaGra = personasNum * 13;
         float harinaKil = harinaGra / 1000;

         System.out.println( "Los kilogramos de harina que se necesitan " + harinaKil);

        

         lectura.close();
        
    }
    
} 
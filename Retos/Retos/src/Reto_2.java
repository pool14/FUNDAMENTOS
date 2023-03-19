import java.util.Scanner;
public class Reto_2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        

        System.out.println("ingrese el nombre del medico");
        String nombreDoc = lectura.nextLine();

        System.out.println("ingrese el nombre de la mamá");
        String nombreMom = lectura.nextLine();

        System.out.println("ingrese el nombre del bebé");
        String nombreBeb = lectura.nextLine();

        System.out.println(" ingrese mes actual ");
        int mesact = lectura.nextInt();

        System.out.println(" ingrese mes de nacimiento de " + nombreBeb);
        int mesanaci = lectura.nextInt();
        
        System.out.println(" ingrese año actual ");
        int anoact = lectura.nextInt();

        System.out.println(" ingrese año de nacimiento de " + nombreBeb);
        int anonaci = lectura.nextInt();

        int mesfin = mesact - mesanaci;
        int anofin = anoact - anonaci;
        int convertidorano = anofin * 12;
        int edadBeb = convertidorano + mesfin;

         System.out.println("La edad de " + nombreBeb + edadBeb + " meses" );
         System.out.println("ingrese el peso "  +  nombreBeb  +  " en kilogramos");
         int pesoBeb = lectura.nextInt();
         System.out.println(" El medico " + nombreDoc + " habla con " + nombreMom + " y le dice que la dosis para " + nombreBeb +" es de " + (pesoBeb+ (15 / edadBeb +10)) * 8 + "  militros");
         lectura.close();
    }
}


import java.util.Scanner;
public class Reto_1 {
    
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

        int cantidad_notas; 
        float promedio;
        float sumador=0;
        


     System.out.println("Ingresar la cantidad de notas");
     cantidad_notas = lectura.nextInt();
     float notas []= new float[cantidad_notas];


     for (int nt = 0; nt < cantidad_notas; nt++) {
        System.out.print("Ingrese la nota " + (nt+1) + ": ");
        float nota = lectura.nextFloat();
        notas[nt] = nota;
    }
    for (float nota : notas) {
        sumador += nota;
    }

    promedio= sumador / cantidad_notas;

    if (promedio < 3) {
        System.out.println("Nota final: " + promedio + " - Reprobaste");
    } else if (promedio < 4) {
        System.out.println("Nota final: " + promedio + " - Pasaste Raspando");
    } else {
        System.out.println("Nota final: " + promedio + " - Aprobaste con buenos resultados");
    }
    lectura.close();
    }
    


}


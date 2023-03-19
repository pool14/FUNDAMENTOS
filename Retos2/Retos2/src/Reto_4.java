import java.util.Scanner;
public class Reto_4 {
     public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

       

        System.out.println("Dijite el espacio de la fila");
        int cuadrado=lectura.nextInt();


        

     int [][] numero = new int[cuadrado][cuadrado];

     
     for ( int i = 0; i <cuadrado; i ++){
        for ( int u = 0; u <cuadrado; u ++){
            System.out.println("Ingrese el numero que va a ir en la fila " + (i+1) + ":" + " Y despues ingrese el numero que va a ir en la la columna " + (u+1) + ":");
            numero[i][u]=lectura.nextInt();

        }

    }
    for ( int i = 0; i <cuadrado; i ++){
        for ( int u = 0; u <cuadrado; u ++){

            System.out.print(numero[i][u]+ "\t" ); 
           
        }
        System.out.println("");
        System.out.println();
    }

for (int e = 0; e <cuadrado; e ++){
    int filas=0;
        for (int w = 0; w <cuadrado; w ++){

            filas += numero[e][w];
            
        }
        System.out.print("la suma de la fila " + (e+1) + " es igual a " + filas  ); 
        System.out.println();
    
    }

    for (  int u = 0; u <cuadrado; u ++){
        int filasc=0;
            for (int m = 0;m <cuadrado; m ++){
    
                filasc += numero[u][m];
                
            }
            System.out.print("la suma de la columna " + (u+1) + " es igual a " + filasc  ); 
            System.out.println();
        }
   
}
}

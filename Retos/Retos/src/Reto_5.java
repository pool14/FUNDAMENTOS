import java.util.Scanner;

public class Reto_5 {

    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

        String empleado;
        String cliente;
        int precio = 0;
        int cantidad = 0;
        int respuesta=1;
        
        System.out.println("Ingrese el nombre del empleado:");
        empleado = lectura.nextLine();
        
        System.out.println("Ingrese el nombre del cliente:");
        cliente = lectura.nextLine();
        
        

        while (respuesta == 1){
            System.out.println("Ingrese el precio del producto:");
            precio += lectura.nextInt();
            cantidad++;
            
            System.out.println("¿Desea agregar otro producto? (1 para Si, 2 para No)");
            respuesta = lectura.nextInt();
        } 
        
        System.out.println("Empleado: " + empleado);
        System.out.println("Cliente: " + cliente);
        System.out.println("Cantidad de productos comprados: " + cantidad);
        System.out.println("Total de la compra: $" + precio);
        lectura.close();
}

}
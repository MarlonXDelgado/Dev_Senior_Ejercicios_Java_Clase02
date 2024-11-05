import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        int pecesRojos;
        int pecesAzules;
        int totalPeces;
        var entrada = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de peces rojos que se van a ingresar al acuario: ");
        pecesRojos = entrada.nextInt();

        System.out.println("Introduzca la cantidad de peces azules que se van a ingresar al acuario: ");
        pecesAzules = entrada.nextInt();

        totalPeces = pecesRojos + pecesAzules;

        System.out.println("La cantidad total de peces en el acuario es de: " + totalPeces);
        
       entrada.close();
    
    }
}

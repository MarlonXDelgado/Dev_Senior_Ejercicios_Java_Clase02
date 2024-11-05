import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        var precioGramo = 5.95;
        var porcionesCompradas = 0;
        var entrada = new Scanner(System.in);
        var preciofinal = 0d;

        System.out.println("El precio por porción de 100 gramos es de 5.95  euros, indique cuantas porciones va a comprar: ");
        porcionesCompradas = entrada.nextInt();

        preciofinal = porcionesCompradas * precioGramo;

        if (porcionesCompradas == 10) {
            System.out.println("El precio por kilo es de: " + preciofinal + " euros");
        } else {
            System.out.println("El precio total es de: " + preciofinal + " euros");
        }

        entrada.close();
    }
}

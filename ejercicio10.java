import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        var num1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        var num2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer número: ");
        var num3 = entrada.nextDouble();

        var media = (num1 + num2 + num3) / 3;

        System.out.println("La media aritmética de los tres números es: " + media);

        entrada.close();
    }
}

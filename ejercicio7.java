import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
        var num1 = 0;
        var num2 = 0;
        var resultado = 0;

        System.out.println("Los números que ingrese seran operados con +, -, * y /");
        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = entrada.nextInt();

        resultado = num1 + num2;
        System.out.printf("La suma entre %d y %d, es de: %d%n", num1, num2, resultado);
        resultado = num1 - num2;
        System.out.printf("La resta entre %d y %d, es de: %d%n", num1, num2, resultado);
        resultado = num1 / num2;
        System.out.printf("La division entre %d y %d, es de: %d%n", num1, num2, resultado);
        resultado = num1 * num2;
        System.out.printf("La multiplicacion entre %d y %d, es de: %d%n", num1, num2, resultado);

        entrada.close();
    }
}

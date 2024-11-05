import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        var num1 = 0;
        var num2 = 0;
        var num3 = 0;
        var num4 = 0;
        var resultado = 0;

        System.out.println("Haremos la operacion 6 / 2 ( 1 + 2 ) y con el resultado, demostraremos si el resultado es 1 o 9");
        System.out.println("De izquierda a derecha, ingrese el primer numero de la operacion: ");
        num1 = entrada.nextInt();
        System.out.println("De izquierda a derecha, ingrese el segundo numero de la operacion: ");
        num2 = entrada.nextInt();
        System.out.println("De izquierda a derecha, ingrese el tercer numero de la operacion: ");
        num3 = entrada.nextInt();
        System.out.println("De izquierda a derecha, ingrese el cuarto numero de la operacion: ");
        num4 = entrada.nextInt();

        resultado = num1/num2*(num3+num4);

        System.out.println("El resultado de la operación es: " + resultado);

        entrada.close();
        
    }

}
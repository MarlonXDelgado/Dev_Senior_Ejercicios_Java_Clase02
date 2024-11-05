import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
        var base = 0d;
        var altura = 0d;
        var area = 0d;
        var perimetro = 0d;

        System.out.println("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        altura = entrada.nextDouble();

        area = base * altura;
        perimetro = (2*base) + (2*altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        entrada.close();
    }
}

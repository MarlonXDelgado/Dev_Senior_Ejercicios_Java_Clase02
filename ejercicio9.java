import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        var gradosCelsius = 0d;
        var gradosFahrenheit = 0d;
        var gradosKelvin = 0d;

        System.out.println("Ingrese los grados Celsius: ");
        gradosCelsius = entrada.nextDouble();

        gradosFahrenheit =  (gradosCelsius * 9/5) + 32;
        gradosKelvin = gradosCelsius + 273.15;

        System.out.println(gradosCelsius + " grados Celsius es igual a " + gradosFahrenheit + " grados Fahrenheit");
        System.out.println(gradosCelsius + " grados Celsius es igual a " + gradosKelvin + " grados Kelvin");

        entrada.close();
    }
}

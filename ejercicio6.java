public class ejercicio6 {
    public static void main(String[] args) {
        var valorTotal = 34;
        var descuento = 0.15;

        //Calcular precio sin descuento
        var precioOriginal = valorTotal / (1 - descuento);

        System.out.println("El precio del pantalon sin el descuento es del: " + precioOriginal + " Euros");

    }
}

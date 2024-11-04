public class ejercicio5 {
    public static void main(String[] args) {

        var precioOriginal = 660;

        //Calcular el descuento del 10%
        var descuento = precioOriginal * 0.1;

        //Totala a pagar 
        var totalaPagar = precioOriginal - descuento;

        System.out.println("El totar a pagar con el 10% de descuento es de: " + totalaPagar + " Euros");

    }
}

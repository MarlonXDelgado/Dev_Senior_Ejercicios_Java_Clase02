public class ejercicio4 {
    public static void main(String[] args) {

        var dineroInicial = 23;
        var devuelta = 12.75;

        //Total de la boleta con descuento del 70%
        var totalGasto = dineroInicial - devuelta;

        //Total de la boleta sin el descuento del 70%
        var subTotal = totalGasto / 0.3;

        System.out.println("El valor de su boleto sin el 70% de descuento es de: " + subTotal + " Euros");
        System.out.println("El valor de su boleto con el 70% de descuento es de: " + totalGasto + " Euros");
        
    }
}

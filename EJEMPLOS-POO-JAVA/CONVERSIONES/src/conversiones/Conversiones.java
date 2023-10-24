package conversiones;

public class Conversiones {
    public static void main(String[] args) {
        double num = 1.70;

        //Casteo a entero
        int numInt = (int) num;

        //Casteo a long
        long numLong = (long) num;

        System.out.println("Double: " + num);
        System.out.println("Double: " + numInt);
        System.out.println("Double: " + numLong);


        //De String a otros tipos
        String cantidad = "15";
        String precio = "15.27";

        int cantEntero = Integer.parseInt(cantidad);//Parseo o convercion de enteros.
        double precioDouble= Double.parseDouble(precio);//Parseo o convercion de doubles.

        System.out.println("El valor total de la compra es: " + (cantEntero + precioDouble));
        System.out.println("---------------------------------------------------------------");

        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Mi edad es: " + edadString + " y mi estatura es: " + estaturaString);
    }
}
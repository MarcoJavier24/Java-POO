public class Main {
    public static void main(String[] args) {
        //Las excepciones a diferencia de los errores son que los errores no permiten la ejecucion del programa mientras que las
        //excepciones se pueden encapsular y tratar.

        //Existen 2 tipos de excepciones
        //Propias de Java como lenguaje
        //Personalizadas. Con estas podemos utilizar las siguientes palabras reservadas para poder contener las excepciones:
        //TRY: Bloque donde puede ocurrir la excepcion
        //CATCH: Escomo el else del try (se ejecuta al dispararse una excepcion en el bloque try)
        //FINALLY: Bloque de codigo que se ejecuta siempre (sin importar si hubieron errores o no)
        //THROW: Lanzar una excepcion cualquiera.
        //THROWS: Determinar que excepciones puede lanzar un metodo.

        //int resultado = 3/0; Exception in thread "main" java.lang.ArithmeticException: / by zero at Main.main(Main.java:16)

        try {
            int resultado = 3/0; //Aqui el programa intenta ejecutar la linea de codigo pero como no se puede se desbia la ejecucion del programa
        } catch (Exception e) { //El catch es igual al else,en este caso como no se va a poder ejecutar el programa, se atrapa la excepcion
            System.out.println("No se puede dividir entre 0"); //Se personaliza el siguiente mensaje de 'error' para que el programa pueda seguir ejecutandose.
        }

        int edades [] = {15, 30, 23, 50};

        System.out.println("La edad de la posicion 5 es: " + edades[4]);
    }
}
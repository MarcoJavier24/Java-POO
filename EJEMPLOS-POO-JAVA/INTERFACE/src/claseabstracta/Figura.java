package claseabstracta;

public interface Figura {

    //INTERFACES
//    Son una colección de métodos abstractos con propiedades (atributos) CONSTANTES.
//        Una interfaz solamente puede extender O implementar otras interfaces (la cantidad que quiera).
//        Da a conocer qué se debe hacer (métodos) pero sin mostrar su implementación (Solo puede tener métodos abstractos).
//        Solo puede tener métodos con acceso público (no pueden ser protected o private).
//        Solo puede tener "variables" public static final (o sea constantes)
//        La palabra "abstract" en la definición de métodos no es obligatoria.
//        Generalmente las interfaces indican el "PUEDE HACER" de un objeto.

//        Si no fuese necesario conocer la ubicación de una figura (x,y), se podría eliminar por completo los atributos y convertir a Figura en una interfaz.
//        Figura nos da ahora métodos que todas las figuras pueden tener; mientras que rotable y dibujable métodos que solo algunas pueden implementar.
//        No se utiliza la palabra extends, sino la palabra implements.


    public double calcularArea(); //Se declara el metodo pero no se escribe su implementacion.

}

package Herencia;

public class Herencia {
    public static void main(String[] args) {

        //HERENCIA
//        Empleado emple = new Empleado();
//
//        emple.getNum_legajo();
//        emple.getNombre(); //En este caso estamos usando la gerencia ya que la propiedad Nombre no esta dentro de empleado si no que hereda de la clase Persona
//
//        Consultor consul = new Consultor();
//        consul.getNombre_consultora();
//        consul.getNombre();

        //POLIMORFISMO

    Persona vector [] = new Persona[5];

    vector [0] = new Persona();
    vector [1] = new Empleado();
    vector [2] = new Consultor();
    vector [3] = new Jefe();

//        En programación orientada a objetos, polimorfismo es la capacidad que tienen los objetos de una clase en ofrecer respuesta distinta e independiente en función de los parámetros (diferentes implementaciones) utilizados durante su invocación.
//        Dicho de otro modo el objeto como entidad puede contener valores de diferentes tipos durante la ejecución del programa.

//        Encapsulamiento: Significa reunir a todos los elementos que pueden considerarse pertenecientes a una misma
//        entidad, al mismo nivel de abstracción. No se debe confundir con el Principio de Ocultación.

//        Principio de Ocultación: Cada objeto está aislado y únicamente expone una interfaz a otros objetos donde
//        especifica cómo pueden interactuar con él. El aislamiento protege a las propiedades de un objeto contra su
//        modificación por quien no tenga derecho a acceder a ellas

    }
}
                                                //CLASES
//    Es una plantilla que permite construir objetos. Por ejemplo, si tuvieramos la clase AUto, esta seria el plano para construir el objeto( en este caso uno o varios autos).
//    Representan "entidades" del mundo real
//    Poseen atributos y metodos.
//    No pueden ser utilizados directamente(sino mediante instancias a objetos)
//    Ejemplos: auto, persona, departamento, factura, recibo, producto
//Las clases deben de tener un nombre en singular y deben de empezar con mayusculas

//public Significa que es una clase publica
//En este caso estamos creando el molde u objeto alumno
package Logica;

public class Alumno {
                                                //ATRIBUTOS
    int id;
    String nombre;
    String apellido;

                                                //METODOS
//    Las operaciones o metodos son acciones contenidas en una clase, y definen su comportamiento.
//    Denteo de un sistema, las operaciones selen detectarse como verbos
//    Desde la perspectiva de diseno y programacion, se denominan metodo.
//    Desde la perspectiva de analisis, se denominan operaciones.
//    Puede tener opcionalmente valores de entrada (parametros) y valores de salida (valores de retorno)
//    Pueden existir PROCEDIMIENTOS (no retornan un valor) y funciones (retornan un valor)
//    Deben de representar la accion que realizan y deben estar en infinitivo
//    Los metodos se escriben con camelCase

//    Metodo sin parametros
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre " );
    }

//    Metodos con parametros
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobe la materia");
        } else {
            System.out.println("Uy no aprobe");
        }
    }
                                                //OBJETOS
//    Un objeto es una instancia de una clase
//    Es la representaccion de un objeto que existe en la vida real.
//    Posee un estado(de acuerdo a sus atributos)
//    Posee un comportamiento(realizan operaciones de acuerdo a sus metodos)

                                                //CONSTRUCTORES
//    Son funciones especiales que contienen las clases para permitir la cracion de objetos
//    Pueden recibir datos/parametros como no (constructor vacio).
//    Se llaman SIEMPRE igual que la clase.
//    No retorna ningun valor (ni siquiera VOID)
//    Generalmente se utilizan dos tipos de constructores: Constructor vacio y sin parametros


//                                              CONSTRUCTOR VACIO
//    Existen casos en cuyos datos vamos a obtenerlos mas adelante pero en ocasiones necesitamos usar sus metodos
    public Alumno() {
    }

                                                //CONSTRUCTOR CON PARAMETROS
    public Alumno(int id, String nombre, String apellido) {
        this.id = id; //Yo estoy diciendo al IDE, de esta clase asignale el parametro que se agrega en los atributos
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GETTERS AND SETTERS


    public int getId() { //Obtener los datos
        return id; //Regresa el dato, en este caso el ID
    }

    public void setId(int id) { //Establecer los datos, en este caso recibe el ID
        this.id = id; //Despues la asigna para colocar un valor
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
